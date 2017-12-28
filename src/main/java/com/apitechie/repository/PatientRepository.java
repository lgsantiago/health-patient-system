package com.apitechie.repository;

import com.apitechie.dto.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by lsantiago on 12/25/17.
 */
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findById(Long id);
}
