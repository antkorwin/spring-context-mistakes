package com.antkorwin.heisenbug.contextmistakes.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 05.05.2019.
 *
 * @author Korovin Anatoliy
 */
@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue queue(){
        return new Queue("test-queue");
    }
}
