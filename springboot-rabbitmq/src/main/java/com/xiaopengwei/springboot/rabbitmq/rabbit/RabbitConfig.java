package com.xiaopengwei.springboot.rabbitmq.rabbit;import org.springframework.amqp.core.Queue;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;/** * <p> * Rabbit 配置 * </p> * * @author XiaoPengwei.com * @since 2019-04-20 */@Configurationpublic class RabbitConfig {    @Bean    public Queue helloQueue() {        return new Queue("hello");    }    @Bean    public Queue objectQueue() {        return new Queue("object");    }}