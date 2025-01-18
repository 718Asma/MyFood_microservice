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

import com.example.demo.Entities.Location;
import com.example.demo.Services.ILocationService;

@RestController
public class LocationController {
    @Autowired
    private ILocationService locationService;

    @Autowired
    Environment environment;

    @GetMapping("/test")
    public String test() {
        return "Location Service is working on port: " + environment.getProperty("local.server.port");
    }

    @GetMapping("/locations")
    public List<Location> getLocations() {
        return locationService.getLocations();
    }

    @GetMapping("/locations/{id}")
    public Location getLocation(@PathVariable int id) {
        return locationService.getLocationById(id);
    }

    @PostMapping("/locations")
    public Location postLocation(@RequestBody Location location) {
        return locationService.addLocation(location);
    }

    @PutMapping("/locations/{id}")
    public Location putLocation(@RequestBody Location location, @PathVariable int id) {
        return locationService.updateLocation(id, location);
    }

    @DeleteMapping("/locations/{id}")
    public boolean deleteLocation(@PathVariable int id) {
        return locationService.deleteLocation(id);
    }
}
