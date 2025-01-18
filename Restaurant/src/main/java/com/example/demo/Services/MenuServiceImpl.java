package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Menu;
import com.example.demo.Repositories.MenuRepository;

@Service
public class MenuServiceImpl implements IMenuService
{
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> getMenus()
    {
        return menuRepository.findAll();
    }

    @Override
    public Menu getMenuById(int id)
    {
        return menuRepository.findById(id).get();
    }

    @Override
    public List<Menu> findRestaurantMenu(String nom)
    {
        return menuRepository.findByNom(nom);
    }

    @Override
    public Menu addMenu(Menu menu)
    {
        return menuRepository.save(menu);
    }

    @Override
    public Menu updateMenu(int id, Menu menu)
    {
        Optional<Menu> m = menuRepository.findById(id);

        if(m.isPresent())
        {
            m.get().setNom(menu.getNom());
            m.get().setPrix(menu.getPrix());
            menuRepository.save(m.get());
        }

        return m.get();
    }

    @Override
    public boolean deleteMenu(int id)
    {
        if (menuRepository.existsById(id))
        {
            menuRepository.deleteById(id);
            return true;
        }

        return false;
    }
    
}
