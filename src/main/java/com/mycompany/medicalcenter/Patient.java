package com.mycompany.medicalcenter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @Column(name = "codepat")
    private String codepat;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    // Constructeurs
    public Patient() {
        // Constructeur par défaut requis par Hibernate
    }

    public Patient(String codepat, String nom, String prenom) {
        this.codepat = codepat;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et setters
    public String getCodepat() {
        return codepat;
    }

    public void setCodepat(String codepat) {
        this.codepat = codepat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}