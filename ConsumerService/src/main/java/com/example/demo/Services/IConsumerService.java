package com.example.demo.Services;

import com.example.demo.Entities.Consumer;
import com.example.demo.Entities.PayementInfo;

public interface IConsumerService {
    public Consumer getInfoConsumer(int id);

    public Consumer subscribeConsumer(Consumer consumer);

    public PayementInfo findCardByConsumer(int consumer_id);
}
