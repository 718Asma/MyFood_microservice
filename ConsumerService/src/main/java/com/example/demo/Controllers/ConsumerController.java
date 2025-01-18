package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Consumer;
import com.example.demo.Entities.PayementInfo;
import com.example.demo.Services.IConsumerService;

@RestController
public class ConsumerController {
    @Autowired
    private IConsumerService consumerService;

    @Autowired
    Environment environment;

    @GetMapping("/test")
    public String test() {
        return "Consumer Service is working on port: " +
                environment.getProperty("local.server.port");
    }

    @GetMapping("/consumers/{id}")
    public Consumer getInfoConsumer(@PathVariable int id) {
        return consumerService.getInfoConsumer(id);
    }

    @PostMapping("/consumers")
    public Consumer subscribeConsumer(@RequestBody Consumer consumer) {
        return consumerService.subscribeConsumer(consumer);
    }

    @GetMapping("/payementInfo/{id}")
    public PayementInfo getCardByConsumer(@PathVariable int id) {
        return consumerService.findCardByConsumer(id);
    }
}