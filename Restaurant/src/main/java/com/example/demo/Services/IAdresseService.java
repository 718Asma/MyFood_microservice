package com.example.demo.Services;

import java.util.List;
import com.example.demo.Entities.Adresse;

public interface IAdresseService
{
    public List<Adresse> getAdresses();
    public Adresse getAdresseById(int id);
    public List<Adresse> findAvailableRestaurants(String ville);
    public Adresse addAdresse(Adresse adresse);
    public Adresse updateAdresse(int id, Adresse adresse);
    public boolean deleteAdresse(int id);
}
