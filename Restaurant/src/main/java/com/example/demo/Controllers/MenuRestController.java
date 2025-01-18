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

import com.example.demo.Entities.Menu;
import com.example.demo.Services.IMenuService;

@RestController
public class MenuRestController {
    @Autowired
    private IMenuService menuService;

    // @Autowired
    // Environment environment;

    // @GetMapping("/test")
    // public String test() {
    // return "Menu Service is working on port: " +
    // environment.getProperty("local.server.port");
    // }

    @GetMapping("/Menus")
    public List<Menu> getMenus() {
        return menuService.getMenus();
    }

    @GetMapping("/Menus/{id}")
    public Menu getMenu(@PathVariable int id) {
        return menuService.getMenuById(id);
    }

    @GetMapping("/MenusByNom")
    public List<Menu> getAvailableMenus(@RequestParam("nom") String nom) {
        return menuService.findRestaurantMenu(nom);
    }

    @PostMapping("/Menus")
    public Menu postMenu(@RequestBody Menu menu) {
        return menuService.addMenu(menu);
    }

    @PutMapping("/Menus/{id}")
    public Menu putMenu(@RequestBody Menu menu, @PathVariable int id) {
        return menuService.updateMenu(id, menu);
    }

    @DeleteMapping("/Menus/{id}")
    public boolean deleteMenu(@PathVariable int id) {
        return menuService.deleteMenu(id);
    }
}
