package com.antkorwin.heisenbug.contextmistakes.service;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

/**
 * Created on 05.05.2019.
 *
 * @author Korovin Anatoliy
 */
@Service
@RequiredArgsConstructor
public class DeliveryServiceImpl implements DeliveryService {

    private final AmqpTemplate amqpTemplate;

    @Override
    public void send(String message) {
        amqpTemplate.convertAndSend("test-queue", message);
    }
}
