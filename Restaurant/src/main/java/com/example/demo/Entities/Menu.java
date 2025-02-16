package com.example.demo.Entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Menu implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
    private int id;

    private String nom;

    private double prix;

    public Menu(){}

    public Menu(String nom, double prix)
    {
        this.nom = nom;
        this.prix = prix;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public double getPrix()
    {
        return prix;
    }

    public void setPrix(double prix)
    {
        this.prix = prix;
    }

    @Override
    public String toString()
    {
        return "Menu [id=" + id + ", nom=" + nom + ", prix=" + prix + "]";
    }
}
