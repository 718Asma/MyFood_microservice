package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entities.Menu;

public interface IMenuService
{
    public List<Menu> getMenus();
    public Menu getMenuById(int id);
    public List<Menu> findRestaurantMenu(String nom);
    public Menu addMenu(Menu menu);
    public Menu updateMenu(int id, Menu menu);
    public boolean deleteMenu(int id);
}
