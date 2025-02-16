package com.example.demo.Entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LineItems implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int quantite;

    private int idMenu;

    private int idTicket;

    public LineItems(){}

    public LineItems(int quantite, int idMenu, int idTicket)
    {
        this.quantite = quantite;
        this.idMenu = idMenu;
        this.idTicket = idTicket;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getQuantite()
    {
        return quantite;
    }

    public void setQuantite(int quantite)
    {
        this.quantite = quantite;
    }

    public int getIdMenu()
    {
        return idMenu;
    }

    public void setIdMenu(int idMenu)
    {
        this.idMenu = idMenu;
    }

    public int getIdTicket()
    {
        return idTicket;
    }

    public void setIdTicket(int idTicket)
    {
        this.idTicket = idTicket;
    }

    @Override
    public String toString()
    {
        return "LineItems [quantite=" + quantite + ", idMenu=" + idMenu + ", idTicket=" + idTicket + "]";
    }
}
