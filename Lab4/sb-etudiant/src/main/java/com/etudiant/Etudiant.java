package com.etudiant;

import jakarta.annotation.Generated;
// import jakarta.persistence.*;

/**
 * Etudiant
 */
@Entity
 public class Etudiant {
    @Id
    @GeneratedValue(strategy=Generation.AUTO)
    private long id;
    private String nom,prenom,numCarte,tel;

    public Etudiant() {}
    public Etudiant(String nom,String prenom, String numCarte,String tel) {
        
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
    public String getNumCarte() {
        return numCarte;
    }
    public void setNumCarte(String numCarte) {
        this.numCarte = numCarte;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

}