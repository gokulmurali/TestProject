/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.common;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author gokul
 */
@MyAnnotation(author = "Gokul", date = "13/09/2018")
public class rabbitMQ {

    private static final String QUEUE_NAME = "Test_Project_Queue";

    private static String USER_NAME = "smartdocs";

    private static String PASSWORD = "smartdocs";

    private static int PORT = 15672;

    private static String HOST_NAME = "localhost";

    public static void main(String[] args) {

    }

    public void send() throws IOException, TimeoutException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(HOST_NAME);
        factory.setPort(PORT);
        factory.setUsername(USER_NAME);
        factory.setPassword(PASSWORD);

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, true, true, true, null);
        String message = "Hello RabbitMQ";
        channel.basicPublish("", message, null, message.getBytes());
        System.out.println("Sent successfully!");
        channel.close();
        connection.close();
    }

    public void receive() {

    }

    public static String getQUEUE_NAME() {
        return QUEUE_NAME;
    }

    public static String getUSER_NAME() {
        return USER_NAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static int getPORT() {
        return PORT;
    }

    public static String getHOST_NAME() {
        return HOST_NAME;
    }

    public static void setUSER_NAME(String USER_NAME) {
        rabbitMQ.USER_NAME = USER_NAME;
    }

    public static void setPASSWORD(String PASSWORD) {
        rabbitMQ.PASSWORD = PASSWORD;
    }

    public static void setPORT(int PORT) {
        rabbitMQ.PORT = PORT;
    }

    public static void setHOST_NAME(String HOST_NAME) {
        rabbitMQ.HOST_NAME = HOST_NAME;
    }

}
