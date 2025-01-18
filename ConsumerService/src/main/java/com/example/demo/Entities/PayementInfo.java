package com.example.demo.Entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PayementInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int id_card;

    private LocalDate date_validite;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codeConsumer")
    private Consumer consumer;

    public PayementInfo() {
    }

    public PayementInfo(int id_card, LocalDate date_validite, Consumer consumer) {
        this.id_card = id_card;
        this.date_validite = date_validite;
        this.consumer = consumer;
    }

    public int getId_card() {
        return id_card;
    }

    public void setId_card(int id_card) {
        this.id_card = id_card;
    }

    public LocalDate getDate_validite() {
        return date_validite;
    }

    public void setDate_validite(LocalDate date_validite) {
        this.date_validite = date_validite;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public String toString() {
        return "PayementInfo [id_card= " + id_card + ", date_validite=" + date_validite + " ]";
    }
}
