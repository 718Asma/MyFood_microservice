package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Ticket;
import com.example.demo.Repositories.TicketRepository;

@Service
public class TicketServiceImpl implements ITicketService
{
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getTickets()
    {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(int id)
    {
        return ticketRepository.findById(id).get();
    }

    @Override
    public Ticket createTicket(Ticket ticket)
    {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(int id, Ticket ticket)
    {
        Optional<Ticket> t = ticketRepository.findById(id);
        
        if(t.isPresent())
        {
            t.get().setPickedUpTime(ticket.getPickedUpTime());
            t.get().setPreparingTime(ticket.getPreparingTime());
            t.get().setState(ticket.getState());
            t.get().setRestaurantId(ticket.getRestaurantId());
            ticketRepository.save(t.get());
        }
        return t.get();
    }

    @Override
    public boolean deleteTicket(int id)
    {
        if (ticketRepository.existsById(id))
	    {
	        ticketRepository.deleteById(id);
	        return true;
	    }
	    
	    return false;
    }

    @Override
    public Ticket acceptTicket(int id)
    {
        Optional<Ticket> t = ticketRepository.findById(id);
        
        if(t.isPresent())
        {
            t.get().setState("Accepted");
            ticketRepository.save(t.get());
        }
        return t.get();
    }

    @Override
    public Ticket readyForPickUp(int id)
    {
        Optional<Ticket> t = ticketRepository.findById(id);
        
        if(t.isPresent())
        {
            t.get().setState("Ready");
            ticketRepository.save(t.get());
        }
        return t.get();
    }
    
}
