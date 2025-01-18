package com.example.demo.Entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DeliveryInfo implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int deliveryTime;

    private int deliveryAdress;

    public DeliveryInfo(){}

    public DeliveryInfo(int deliveryTime, int deliveryAdress)
    {
        this.deliveryTime = deliveryTime;
        this.deliveryAdress = deliveryAdress;
    }

    public int getDeliveryTime()
    {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime)
    {
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryAdress()
    {
        return deliveryAdress;
    }

    public void setDeliveryAdress(int deliveryAdress)
    {
        this.deliveryAdress = deliveryAdress;
    }

    @Override
    public String toString()
    {
        return "DeliveryInfo [deliveryTime=" + deliveryTime + ", deliveryAdress=" + deliveryAdress + "]";
    }

    
}
