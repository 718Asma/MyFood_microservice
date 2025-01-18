package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entities.DeliveryInfo;

public interface DeliveryInfoRepository extends JpaRepository<DeliveryInfo, Integer>
{
    
}
