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

import com.example.demo.Entities.Order;
import com.example.demo.Services.IOrderService;

@RestController
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @Autowired
    Environment environment;

    @GetMapping("/test")
    public String test() {
        return "Order Service is working on port: " + environment.getProperty("local.server.port");
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @GetMapping("/orders/{id}")
    public Order getOrder(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/orders")
    public Order postOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/orders/{Id}")
    public Order updateOrder(@RequestBody Order order, @PathVariable int Id) {
        return orderService.updateOrder(Id, order);
    }

    @PutMapping("/reviseOrder/{Id}")
    public Order reviseOrder(@RequestBody Order order, @PathVariable int Id) {
        return orderService.reviseOrder(order, Id);
    }

    @PutMapping("cancelOrder/{id}")
    public Order cancelOrder(@PathVariable int id) {
        return orderService.cancelOrder(id);
    }

    @DeleteMapping("/orders/{id}")
    public boolean deleteOrder(@PathVariable int id) {
        return orderService.deleteOrder(id);
    }
}
