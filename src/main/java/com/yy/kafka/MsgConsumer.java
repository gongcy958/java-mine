package com.yy.kafka;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.PartitionInfo;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.*;

/**
 * @author gongcy
 * @date 2023/9/12 3:07 下午
 * @Description
 */
public class MsgConsumer {

//    private final static String TOPIC_NAME = "my‐replicated‐topic";
//    private final static String CONSUMER_GROUP_NAME = "testGroup";
//
//    public static void main(String[] args) {
//
//        Properties properties = new Properties();
//        // 假通
//        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"8.131.93.231:9092");
//        properties.put(ConsumerConfig.GROUP_ID_CONFIG,CONSUMER_GROUP_NAME);
//        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,true);
//        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG,"1000");
//        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");
//        properties.put(ConsumerConfig.HEARTBEAT_INTERVAL_MS_CONFIG,1000);
//        properties.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG,10 * 1000);
//        properties.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG,500);
//        properties.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG,30 * 1000);
//        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
//        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class.getName());
//
//        KafkaConsumer<String,String> consumer = new KafkaConsumer<>(properties);
//
//        consumer.subscribe(Collections.singletonList(TOPIC_NAME));
//
//        consumer.assign(Collections.singletonList(new TopicPartition(TOPIC_NAME, 0)));
//
//        consumer.assign(Collections.singletonList(new TopicPartition(TOPIC_NAME, 0)));
//
//        consumer.seekToBeginning(Collections.singletonList(new TopicPartition(TOPIC_NAME, 0)));
//
//        consumer.assign(Arrays.asList(new TopicPartition(TOPIC_NAME,0)));
//        consumer.seek(new TopicPartition(TOPIC_NAME,0),10);
//
//        List<PartitionInfo> partitionInfos = consumer.partitionsFor(TOPIC_NAME);
//        long fetchDataTime = new Date().getTime() - 1000 * 60 * 60;
//        Map<TopicPartition,Long> map = new HashMap<>();
//
//        for (PartitionInfo par : partitionInfos) {
//            map.put(new TopicPartition(TOPIC_NAME,par.partition()),fetchDataTime);
//        }
//
//        Map<TopicPartition, OffsetAndTimestamp> parMap = consumer.offsetsForTimes(map);
//        for (Map.Entry<TopicPartition, OffsetAndTimestamp> entry : parMap.entrySet()) {
//            TopicPartition key = entry.getKey();
//            OffsetAndTimestamp value = entry.getValue();
//
//            if (key == null || value == null) {
//                continue;
//            }
//
//            long offset = value.offset();
//            System.out.println("partition-" + key.partition() + "|offset-" + offset);
//            System.out.println();
//
//            if (value != null) {
//                consumer.assign(Arrays.asList(key));
//                consumer.seek(key,offset);
//            }
//        }
//
//        while (true) {
//            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
//            for (ConsumerRecord<String, String> record : records) {
//                int partition = record.partition();
//                long offset = record.offset();
//                String key = record.key();
//                String value = record.value();
//
//            }
//
//            if (records.count() > 0) {
//                consumer.commitSync();
//
//                consumer.commitAsync(new OffsetCommitCallback() {
//                    @Override
//                    public void onComplete(Map<TopicPartition, OffsetAndMetadata> map, Exception e) {
//                        if (e != null) {
//                            System.out.println("打印");
//                        }
//                    }
//                });
//            }
//        }
//
//    }
}
