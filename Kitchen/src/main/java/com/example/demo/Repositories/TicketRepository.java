package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>
{
    
}