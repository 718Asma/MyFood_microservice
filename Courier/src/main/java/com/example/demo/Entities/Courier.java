package com.example.demo.Entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courier implements Serializable
{
    private static final long serialVersionUID = 1L;
	
	@Id
    private int cin;

    private String nom;

    private int telephone;

    private boolean disponible;

    public Courier(){}

    public Courier(int cin, String nom, int telephone, boolean disponible)
    {
        this.cin = cin;
        this.nom = nom;
        this.telephone = telephone;
        this.disponible = disponible;
    }

    public int getCin()
    {
        return cin;
    }

    public void setCin(int cin)
    {
        this.cin = cin;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getTelephone()
    {
        return telephone;
    }

    public void setTelephone(int telephone)
    {
        this.telephone = telephone;
    }

    public boolean isDisponible()
    {
        return disponible;
    }

    public void setDisponible(boolean disponible)
    {
        this.disponible = disponible;
    }

    @Override
    public String toString()
    {
        return "Courier{" +
                "cin=" + cin +
                ", nom='" + nom + '\'' +
                ", telephone=" + telephone +
                ", disponible=" + disponible +
                '}';
    }
}
