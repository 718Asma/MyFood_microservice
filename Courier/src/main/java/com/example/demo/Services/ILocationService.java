package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entities.Location;

public interface ILocationService
{
    public List<Location> getLocations();
    public Location getLocationById(int id);
    public Location addLocation(Location location);
    public Location updateLocation(int id, Location location);
    public boolean deleteLocation(int id);
}
