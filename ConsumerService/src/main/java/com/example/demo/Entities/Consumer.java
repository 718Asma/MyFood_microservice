package com.example.demo.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Consumer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nom;

    private String telephone;

    private String adresse_mail;

    @OneToMany(mappedBy = "consumer")
    private List<PayementInfo> payementInfo = new ArrayList<>();

    public Consumer() {
    }

    public Consumer(String nom, String telephone, String adresse_mail) {
        this.nom = nom;
        this.telephone = telephone;
        this.adresse_mail = adresse_mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse_mail() {
        return adresse_mail;
    }

    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    // public List<PayementInfo> getPayementInfo() {
    // return payementInfo;
    // }

    // public void setPayementInfo(List<PayementInfo> payementInfo) {
    // this.payementInfo = payementInfo;
    // }

    @Override
    public String toString() {
        return "Consumer [nom=" + nom + ", telephone=" + telephone + ", adresse_mail=" + adresse_mail + "]";
    }
}
