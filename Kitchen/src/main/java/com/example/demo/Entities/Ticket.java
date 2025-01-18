package com.example.demo.Entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String state;

    private int restaurantId;

    private int preparingTime;

    private int pickedUpTime;

    public Ticket(){}

    public Ticket(String state, int restaurantId, int preparingTime, int pickedUpTime)
    {
        this.state = state;
        this.restaurantId = restaurantId;
        this.preparingTime = preparingTime;
        this.pickedUpTime = pickedUpTime;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public int getRestaurantId()
    {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId)
    {
        this.restaurantId = restaurantId;
    }

    public int getPreparingTime()
    {
        return preparingTime;
    }

    public void setPreparingTime(int preparingTime)
    {
        this.preparingTime = preparingTime;
    }

    public int getPickedUpTime()
    {
        return pickedUpTime;
    }

    public void setPickedUpTime(int pickedUpTime)
    {
        this.pickedUpTime = pickedUpTime;
    }

    @Override
    public String toString()
    {
        return "Ticket [stat=" + state + ", restaurantId=" + restaurantId + ", preparingTime=" + preparingTime
                + ", pickedUpTime=" + pickedUpTime + "]";
    }
}
