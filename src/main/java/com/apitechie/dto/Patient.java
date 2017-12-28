package com.apitechie.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by lsantiago on 12/25/17.
 */
@Data
@Entity
@JsonFormat
public class Patient {

    Patient() {}

    public Patient(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String phone;
    private String license;
    private Date dob;
    private Long insurance;
    private Date lastVisit;
    private Date createdDate;
    private Date updatedDate;
}
