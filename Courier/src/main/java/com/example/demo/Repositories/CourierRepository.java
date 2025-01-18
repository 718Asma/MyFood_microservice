package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Courier;

public interface CourierRepository extends JpaRepository<Courier, Integer>
{
    
}