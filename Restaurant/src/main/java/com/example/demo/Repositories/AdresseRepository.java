package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entities.Adresse;

public interface AdresseRepository extends JpaRepository<Adresse, Integer>
{
    @Query("SELECT a FROM Adresse a WHERE a.ville = ?1")
    public List<Adresse> findByVille(String ville);
}
