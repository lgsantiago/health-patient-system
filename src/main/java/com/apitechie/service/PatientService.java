package com.apitechie.service;

import com.apitechie.dto.Patient;
import com.apitechie.exception.PatientNotFoundException;
import com.apitechie.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by lsantiago on 12/25/17.
 */

@Service
public class PatientService {

    private PatientRepository patientRepository;

    @Autowired
    PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public Patient getPatient(Long patientId) {
        Optional<Patient> patient = patientRepository.findById(patientId);
        validatePatient(patient, patientId);
        return patient.get();
    }

    public Patient savePatient(Patient patient) {
        validateNewPatient(patient);
        Patient persistedPatient = patientRepository.save(patient);
        return persistedPatient;
    }

    private void validatePatient(Optional<Patient> patient, Long patientId) {
        if(!patient.isPresent())
            throw new PatientNotFoundException(patientId);

        return;
    }

    private void validateNewPatient(Patient patient) {
        return;
    }
}
