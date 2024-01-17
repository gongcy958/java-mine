package com.yy.kafka;


import org.springframework.stereotype.Component;

/**
 * @author gongcy
 * @date 2023/9/12 3:44 下午
 * @Description
 */
@Component
public class MyConsumer {

    /**
     *
     * @param record
     * @param ack
     */
//    @KafkaListener(topics = "my-replicated-topic",groupId = "xp")
//    public void listenXp(ConsumerRecord<String,String> record, Acknowledgment ack){
//        String value = record.value();
//        System.out.println(value);
//        System.out.println(record);
//
//        ack.acknowledge();
//    }
//
//    @KafkaListener(topics = "my-replicated-topic", groupId = "kz")
//    public void listenKz(ConsumerRecord<String, String> record, Acknowledgment ack) {
//        String value = record.value();
//        System.out.println(value);
//        System.out.println(record);
//
//        ack.acknowledge();
//    }
}
