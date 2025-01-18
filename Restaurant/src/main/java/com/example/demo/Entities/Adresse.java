package com.example.demo.Entities;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Adresse implements Serializable
{
    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
    private int numero;

    private String nom;

    private String rue;

    private String cite;

    private String ville;

    public Adresse(int numero, String nom, String rue, String cite, String ville)
    {
        this.numero = numero;
        this.nom = nom;
        this.rue = rue;
        this.cite = cite;
        this.ville = ville;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getRue()
    {
        return rue;
    }

    public void setRue(String rue)
    {
        this.rue = rue;
    }

    public String getCite()
    {
        return cite;
    }

    public void setCite(String cite)
    {
        this.cite = cite;
    }

    public String getVille()
    {
        return ville;
    }

    public void setVille(String ville)
    {
        this.ville = ville;
    }

    @Override
    public String toString()
    {
        return "Adresse [numero=" + numero + ", nom=" + nom + ", rue=" + rue + ", cite=" + cite + ", ville=" + ville
                + "]";
    }
}
