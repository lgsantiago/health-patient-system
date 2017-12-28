package com.apitechie;

import com.apitechie.dto.Patient;
import com.apitechie.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class HealthPatientSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthPatientSystemApplication.class, args);
	}

	@Bean
	CommandLineRunner init(PatientRepository patientRepository) {

		return (evt) -> Arrays.asList(
				"Luis,Jay,Guil".split(","))
				.forEach(
						p -> {
							Patient patient = patientRepository.save(new Patient(p, "Smith",
									"7872434321"));
						});
	}

}
