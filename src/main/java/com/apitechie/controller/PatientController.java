package com.apitechie.controller;

import com.apitechie.dto.Patient;
import com.apitechie.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lsantiago on 12/25/17.
 */
@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    PatientService patientService;

    @Autowired
    PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @GetMapping("/{patientId}")
    public ResponseEntity<Patient> getPatient(@PathVariable Long patientId) {
        return new ResponseEntity<>(patientService.getPatient(patientId), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
        return new ResponseEntity<>(patientService.savePatient(patient), HttpStatus.OK);
    }

}
