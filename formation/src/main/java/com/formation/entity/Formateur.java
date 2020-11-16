package com.formation.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Formateurs")
public class Formateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")

    private String firstName;

    @Column(name="last_name")
     private String lastName;

    @Column(name="email")
     private String email;

    @Column(name="phoneI")
     private int phone;

    @Column(name="specialty")
     private String specialty;


    public Formateur() {
    }

    public Formateur(String firstName, String lastName, String email, int phone, String specialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.specialty = specialty;
    }

    public Formateur(Long id, String firstName, String lastName, String email, int phone, String specialty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.specialty = specialty;
    }
}
