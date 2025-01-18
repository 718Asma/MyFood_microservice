package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Adresse;
import com.example.demo.Services.IAdresseService;

@RestController
public class AdresseRestController {
    @Autowired
    private IAdresseService adresseService;

    // @Autowired
    // Environment environment;

    // @GetMapping("/test")
    // public String test() {
    // return "Adresse Service is working on port: " +
    // environment.getProperty("local.server.port");
    // }

    @GetMapping("/Adresses")
    public List<Adresse> getAdresses() {
        return adresseService.getAdresses();
    }

    @GetMapping("/Adresses/{id}")
    public Adresse getAdresse(@PathVariable int id) {
        return adresseService.getAdresseById(id);
    }

    @GetMapping("/Restaurants")
    public List<Adresse> getAvailableRestaurant(@RequestParam("ville") String ville) {
        return adresseService.findAvailableRestaurants(ville);
    }

    @PostMapping("/Adresses")
    public Adresse postAdresse(@RequestBody Adresse adresse) {
        return adresseService.addAdresse(adresse);
    }

    @PutMapping("/Adresses/{id}")
    public Adresse putAdresse(@RequestBody Adresse adresse, @PathVariable int id) {
        return adresseService.updateAdresse(id, adresse);
    }

    @DeleteMapping("/Adresses/{id}")
    public boolean deleteAdresse(@PathVariable int id) {
        return adresseService.deleteAdresse(id);
    }
}
