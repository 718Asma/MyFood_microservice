package com.example.demo.Services;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Delivery;
import com.example.demo.Repositories.DeliveryRepository;

@Service
public class DeliveryServiceImpl implements IDeliveryService {
    @Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public Delivery noteDeliveryPickedup(int id) {
        Optional<Delivery> delivery = deliveryRepository.findById(id);

        if (delivery.isPresent()) {
            delivery.get().setScheduledPickupTime(LocalDateTime.now());
            delivery.get().setStatus("Picked Up");
            deliveryRepository.save(delivery.get());

            return delivery.get();
        } else {
            return null;
        }
    }

    @Override
    public Delivery noteDeliveryDelivered(int id) {
        Optional<Delivery> delivery = deliveryRepository.findById(id);

        if (delivery.isPresent()) {
            delivery.get().setScheduledDeliveryTime(LocalDateTime.now());
            delivery.get().setStatus("Done");
            deliveryRepository.save(delivery.get());

            return delivery.get();
        } else {
            return null;
        }
    }

    @Override
    public Delivery noteDeliveryCanceled(int id) {
        Optional<Delivery> delivery = deliveryRepository.findById(id);

        if (delivery.isPresent()) {
            delivery.get().setScheduledDeliveryTime(null);
            delivery.get().setScheduledPickupTime(null);
            delivery.get().setStatus("Canceled");
            deliveryRepository.save(delivery.get());

            return delivery.get();
        } else {
            return null;
        }
    }

    @Override
    public Delivery scheduleDelivery(int orderId) {
        Delivery delivery = new Delivery(orderId, "Pending", null, null);
        return deliveryRepository.save(delivery);
    }
}