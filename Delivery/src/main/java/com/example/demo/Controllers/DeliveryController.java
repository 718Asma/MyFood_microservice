package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Delivery;
import com.example.demo.Services.IDeliveryService;

@RestController
public class DeliveryController {
    @Autowired
    private IDeliveryService deliveryService;

    @Autowired
    Environment environment;

    @GetMapping("/test")
    public String test() {
        return "Delivery Service is working on port: " + environment.getProperty("local.server.port");
    }

    @PostMapping("/deliveries/{orderId}")
    public Delivery scheduleDelivery(@PathVariable("orderId") int orderId) {
        return deliveryService.scheduleDelivery(orderId);
    }

    @PutMapping("/deliveries/pickedup/{id}")
    public Delivery noteDeliveryPickedup(@PathVariable int id) {
        return deliveryService.noteDeliveryPickedup(id);
    }

    @PutMapping("/deliveries/delivered/{id}")
    public Delivery noteDeliveryDelivered(@PathVariable int id) {
        return deliveryService.noteDeliveryDelivered(id);
    }

    @PutMapping("/deliveries/canceled/{id}")
    public Delivery noteDeliveryCanceled(@PathVariable int id) {
        return deliveryService.noteDeliveryCanceled(id);
    }
}
