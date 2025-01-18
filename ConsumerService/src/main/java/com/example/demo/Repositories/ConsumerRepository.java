package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Integer> {

}