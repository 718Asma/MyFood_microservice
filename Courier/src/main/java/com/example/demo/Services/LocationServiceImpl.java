package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Location;
import com.example.demo.Repositories.LocationRepository;

@Service
public class LocationServiceImpl implements ILocationService {
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location getLocationById(int id) {
        return locationRepository.findById(id).get();
    }

    @Override
    public Location addLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location updateLocation(int id, Location location) {
        Optional<Location> l = locationRepository.findById(id);

        if (l.isPresent()) {
            l.get().setLatitude(location.getLatitude());
            l.get().setLongitude(location.getLongitude());
            locationRepository.save(l.get());
        }
        return l.get();
    }

    @Override
    public boolean deleteLocation(int id) {
        if (locationRepository.existsById(id)) {
            locationRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
