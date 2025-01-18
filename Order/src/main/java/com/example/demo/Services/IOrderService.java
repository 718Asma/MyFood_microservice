package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entities.Order;

public interface IOrderService
{
    public List<Order> getOrders();
    public Order getOrderById(int id);
    public Order createOrder(Order order);
    public Order updateOrder(int id, Order order);
    public boolean deleteOrder(int id);
    public Order cancelOrder(int id);
    public Order reviseOrder(Order order, int id);
}
