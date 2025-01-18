package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.LineItems;

public interface LineItemsRepository extends JpaRepository<LineItems, Integer>
{
    
}