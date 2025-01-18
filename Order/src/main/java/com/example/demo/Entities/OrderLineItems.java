package com.example.demo.Entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderLineItems implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
    private int id;
    
    private int quantite;

    private int idMenu;

    private int idOrder;

    public OrderLineItems(){}

    public OrderLineItems(int quantite, int idMenu, int idOrder)
    {
        this.quantite = quantite;
        this.idMenu = idMenu;
        this.idOrder = idOrder;
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

    public int getIdOrder()
    {
        return idOrder;
    }

    public void setIdOrder(int idOrder)
    {
        this.idOrder = idOrder;
    }

    @Override
    public String toString()
    {
        return "OrderLineItems [quantite=" + quantite + ", idMenu=" + idMenu + ", idOrder=" + idOrder + "]";
    }
}
