package com.mycompany.medicalcenter;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visite")
public class Visite {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "codemed", nullable = false)
    private Medecin medecin;

    @ManyToOne
    @JoinColumn(name = "codepat", nullable = false)
    private Patient patient;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    // Constructeur par défaut requis par JPA
    public Visite() {}

    public Visite(Long id, Medecin medecin, Patient patient, LocalDate date) {
        this.id = id;
        this.medecin = medecin;
        this.patient = patient;
        this.date = date;
    }
    
    // Constructeur sans id (celui qui manquait)
    public Visite(Medecin medecin, Patient patient, LocalDate date) {
        this.medecin = medecin;
        this.patient = patient;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    

   

}
