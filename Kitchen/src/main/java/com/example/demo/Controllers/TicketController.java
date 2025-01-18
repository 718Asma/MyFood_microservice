package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Ticket;
import com.example.demo.Services.ITicketService;

@RestController
public class TicketController {
    @Autowired
    private ITicketService ticketService;

    @Autowired
    Environment environment;

    @GetMapping("/test")
    public String test() {
        return "Ticket Service is working on port: " + environment.getProperty("local.server.port");
    }

    @GetMapping("/tickets")
    public List<Ticket> getTickets() {
        return ticketService.getTickets();
    }

    @GetMapping("/tickets/{id}")
    public Ticket getTicket(@PathVariable int id) {
        return ticketService.getTicketById(id);
    }

    @PostMapping("/tickets")
    public Ticket postTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @PutMapping("/tickets/{Id}")
    public Ticket putTicket(@PathVariable int Id) {
        return ticketService.acceptTicket(Id);
    }

    @PutMapping("ticket/{id}")
    public Ticket updateTicket(@PathVariable int id, @RequestBody Ticket ticket) {
        return ticketService.updateTicket(id, ticket);
    }

    @PutMapping("readyForPickUp/{id}")
    public Ticket readyForPickUp(@PathVariable int id) {
        return ticketService.readyForPickUp(id);
    }

    @DeleteMapping("/tickets/{id}")
    public boolean deleteTicket(@PathVariable int id) {
        return ticketService.deleteTicket(id);
    }

}
