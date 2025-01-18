package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Consumer;
import com.example.demo.Entities.PayementInfo;
import com.example.demo.Repositories.ConsumerRepository;
import com.example.demo.Repositories.PayementInfoRepository;

@Service
public class ConsumerServiceImpl implements IConsumerService {
    @Autowired
    private ConsumerRepository consumerRepository;

    @Autowired
    private PayementInfoRepository payementInfoRepository;

    @Override
    public Consumer getInfoConsumer(int id) {
        Optional<Consumer> consumer = consumerRepository.findById(id);

        if (consumer.isPresent()) {
            return consumerRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public Consumer subscribeConsumer(Consumer consumer) {
        return consumerRepository.save(consumer);
    }

    @Override
    public PayementInfo findCardByConsumer(int consumer_id) {
        Optional<Consumer> consumer = consumerRepository.findById(consumer_id);
        List<PayementInfo> payementInfos = payementInfoRepository.findAll();

        if (consumer.isPresent()) {
            for (PayementInfo payementInfo : payementInfos) {
                if (payementInfo.getConsumer().getId() == consumer_id) {
                    return payementInfo;
                }
            }
        }

        return null;
    }
}