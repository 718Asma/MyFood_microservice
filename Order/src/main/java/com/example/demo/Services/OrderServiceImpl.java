package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Order;
import com.example.demo.Repositories.OrderRepository;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(int id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(int id, Order order) {
        Optional<Order> o = orderRepository.findById(id);

        if (o.isPresent()) {
            o.get().setState(order.getState());
            o.get().setConsumerId(order.getConsumerId());
            o.get().setRestaurantId(order.getRestaurantId());

            orderRepository.save(o.get());
        }

        return o.get();
    }

    @Override
    public boolean deleteOrder(int id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public Order cancelOrder(int id) {
        Optional<Order> o = orderRepository.findById(id);

        if (o.isPresent()) {
            o.get().setState("Cancelled");
            orderRepository.save(o.get());
        }
        return o.get();
    }

    @Override
    public Order reviseOrder(Order order, int id) {
        Optional<Order> o = orderRepository.findById(order.getId());

        if (o.isPresent()) {
            o.get().setState(order.getState());
            o.get().setConsumerId(order.getConsumerId());
            o.get().setRestaurantId(order.getRestaurantId());

            orderRepository.save(o.get());
        }

        return o.get();
    }

}
