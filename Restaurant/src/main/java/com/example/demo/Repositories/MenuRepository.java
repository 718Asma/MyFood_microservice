package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer>
{
    @Query("SELECT m FROM Menu m WHERE m.nom LIKE %?1%")
    public List<Menu> findByNom(String nom);
}
