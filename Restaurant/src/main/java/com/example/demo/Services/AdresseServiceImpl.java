package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Adresse;
import com.example.demo.Repositories.AdresseRepository;

@Service
public class AdresseServiceImpl implements IAdresseService
{
    @Autowired
    private AdresseRepository adresseRepository;

    @Override
    public List<Adresse> getAdresses()
    {
        return adresseRepository.findAll();
    }

    @Override
    public Adresse getAdresseById(int id)
    {
        return adresseRepository.findById(id).get();
    }
    
    @Override
    public List<Adresse> findAvailableRestaurants(String ville)
    {
        return adresseRepository.findByVille(ville);
    }

    @Override
    public Adresse addAdresse(Adresse adresse)
    {
        return adresseRepository.save(adresse);
    }

    @Override
    public Adresse updateAdresse(int id, Adresse adresse)
    {
        Optional<Adresse> a = adresseRepository.findById(id);

        if(a.isPresent())
        {
            a.get().setNom(adresse.getNom());
            a.get().setRue(adresse.getRue());
            a.get().setCite(adresse.getCite());
            a.get().setVille(adresse.getVille());
            adresseRepository.save(a.get());
        }

        return a.get();
    }

    @Override
    public boolean deleteAdresse(int id)
    {
        if (adresseRepository.existsById(id))
	    {
	        adresseRepository.deleteById(id);
	        return true;
	    }
	    
	    return false;
    }
}
