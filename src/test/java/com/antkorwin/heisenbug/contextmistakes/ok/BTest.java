package com.antkorwin.heisenbug.contextmistakes.ok;

import com.antkorwin.heisenbug.contextmistakes.service.DeliveryService;
import com.jupiter.tools.spring.test.rabbitmq.annotation.ExpectedMessage;
import com.jupiter.tools.spring.test.rabbitmq.annotation.meta.EnableRabbitMqTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created on 05.05.2019.
 *
 * @author Korovin Anatoliy
 */
@EnableRabbitMqTest
class BTest {

    @Autowired
    private DeliveryService deliveryService;

    @Test
    @ExpectedMessage(queue = "test-queue", message = "any secret message")
    void sendMessage() {
        deliveryService.send("any secret message");
    }
}
