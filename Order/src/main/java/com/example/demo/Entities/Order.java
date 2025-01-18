package com.example.demo.Entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
    private int id;

    private String state;

    private int consumerId;

    private int restaurantId;

    public Order(){}

    public Order(String state, int consumerId, int restaurantId)
    {
        this.state = state;
        this.consumerId = consumerId;
        this.restaurantId = restaurantId;
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

    public int getConsumerId()
    {
        return consumerId;
    }

    public void setConsumerId(int consumerId)
    {
        this.consumerId = consumerId;
    }

    public int getRestaurantId()
    {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId)
    {
        this.restaurantId = restaurantId;
    }

    @Override
    public String toString()
    {
        return "Order [state=" + state + ", consumerId=" + consumerId + ", restaurantId=" + restaurantId + "]";
    }
}
