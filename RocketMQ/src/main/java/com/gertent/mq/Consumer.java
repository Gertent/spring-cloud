package com.gertent.mq;

import java.util.List;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;

import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;

import com.alibaba.rocketmq.client.exception.MQClientException;

import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;

import com.alibaba.rocketmq.common.message.MessageExt;

/**

 * Consumer，订阅消息

 */

public class Consumer {

    public static void main(String[] args) throws InterruptedException, MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("please_rename_unique_group_name_4");
        consumer.setNamesrvAddr("192.168.0.94:9876");
        /**
         * 设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费<br>
         * 如果非第一次启动，那么按照上次消费的位置继续消费
         */
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        consumer.subscribe("TopicTest", "*");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
                                                            ConsumeConcurrentlyContext context) {
                System.out.println(Thread.currentThread().getName() + " Receive New Messages: " + msgs);
                System.out.println(" Receive Message Size: " + msgs.size());
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        consumer.start();
        System.out.println("Consumer Started.");
    }
    public static void test(){
        DefaultMQPushConsumer consumer=new DefaultMQPushConsumer("cconsumer");
        consumer.setNamesrvAddr("127.0.0.1:9876");
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                System.out.println("Receive New Messages:"+list);
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
    }
}
