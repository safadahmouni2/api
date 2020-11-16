package com.formation.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="Formations")

public class Formation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name="Name")
    private String name;

    @Column(name="Date Debut")
    private Date dateDebut;

    @Column(name="Date Fin")
    private Date dateFin;



    public Formation(String name, Date dateDebut, Date dateFin) {
        this.name = name;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
   //     this.formateur = formateur;
    }

    public Formation() {
    }

}
