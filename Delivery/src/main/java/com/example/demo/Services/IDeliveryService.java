package com.example.demo.Services;

import com.example.demo.Entities.Delivery;

public interface IDeliveryService {
    public Delivery noteDeliveryPickedup(int id);

    public Delivery noteDeliveryDelivered(int id);

    public Delivery noteDeliveryCanceled(int id);

    public Delivery scheduleDelivery(int orderId);

}
