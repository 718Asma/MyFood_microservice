package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entities.OrderLineItems;

public interface OrderLineItemsRepository extends JpaRepository<OrderLineItems, Integer>
{
    
}
