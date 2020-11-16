package com.formation.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "formations")

public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")

    private String name;

    @Column(name="date_debut")
    private Date dateDebut;

    @Column(name="date_fin")
    private String DateFin;

    @ManyToOne(optional=false)
    @JoinColumn(name="id_formateur")
    private Formateur formateur;

    public Formation() {
    }

}
