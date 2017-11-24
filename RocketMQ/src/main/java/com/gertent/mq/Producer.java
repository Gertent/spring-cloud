package com.gertent.mq;

import com.alibaba.rocketmq.client.exception.MQClientException;

import com.alibaba.rocketmq.client.producer.DefaultMQProducer;

import com.alibaba.rocketmq.client.producer.SendResult;

import com.alibaba.rocketmq.common.message.Message;

/**

 * Producer，发送消息

 *

 */

public class Producer {

    public static void main(String[] args) throws MQClientException, InterruptedException {

        DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name");
        producer.setNamesrvAddr("192.168.0.94:9876");
        producer.start();
        for (int i = 0; i < 1000; i++) {
            try {
                Message msg = new Message("TopicTest",// topic
                        "TagA",// tag
                        ("Hello RocketMQ " + i).getBytes()// body
                );
                SendResult sendResult = producer.send(msg);
                System.out.println(sendResult);
                Thread.sleep(3000);
            }catch (Exception e) {
                e.printStackTrace();
                Thread.sleep(3000);
            }
        }
        producer.shutdown();
    }

    public static void test() throws MQClientException, InterruptedException {
        DefaultMQProducer producer=new DefaultMQProducer("producer");
        producer.setNamesrvAddr("192.168.0.94:9876");
        producer.start();
        for (int i = 0; i < 100; i++) {
            try{
                Message msg=new Message("toptic","tag","body".getBytes());
                SendResult sendResult=producer.send(msg);
                System.out.println(sendResult);
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
                Thread.sleep(3000);
            }
        }
        producer.shutdown();
    }
}
