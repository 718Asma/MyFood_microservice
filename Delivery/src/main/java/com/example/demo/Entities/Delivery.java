package com.example.demo.Entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "deliveries")
public class Delivery implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int orderId;

    private String status;

    private LocalDateTime scheduledPickupTime;

    private LocalDateTime scheduledDeliveryTime;

    public Delivery() {
    }

    public Delivery(int orderId, String status, LocalDateTime scheduledPickupTime,
            LocalDateTime scheduledDeliveryTime) {
        this.orderId = orderId;
        this.status = status;
        this.scheduledPickupTime = scheduledPickupTime;
        this.scheduledDeliveryTime = scheduledDeliveryTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getScheduledPickupTime() {
        return scheduledPickupTime;
    }

    public void setScheduledPickupTime(LocalDateTime scheduledPickupTime) {
        this.scheduledPickupTime = scheduledPickupTime;
    }

    public LocalDateTime getScheduledDeliveryTime() {
        return scheduledDeliveryTime;
    }

    public void setScheduledDeliveryTime(LocalDateTime scheduledDeliveryTime) {
        this.scheduledDeliveryTime = scheduledDeliveryTime;
    }

    @Override
    public String toString() {
        return "Delivery [id=" + id + ", orderId=" + orderId + ", scheduledPickupTime=" + scheduledPickupTime
                + ", scheduledDeliveryTime=" + scheduledDeliveryTime + ", status=" + status + "]";
    }
}
