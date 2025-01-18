package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entities.Ticket;

public interface ITicketService
{
    public List<Ticket> getTickets();
    public Ticket getTicketById(int id);
    public Ticket createTicket(Ticket ticket);
    public Ticket updateTicket(int id, Ticket ticket);
    public boolean deleteTicket(int id);
    public Ticket acceptTicket(int id);
    public Ticket readyForPickUp(int id);

}
