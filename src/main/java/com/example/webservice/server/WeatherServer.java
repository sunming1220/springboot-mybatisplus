package com.example.webservice.server;

import javax.xml.ws.Endpoint;

/**
 * Created by sunming on 2019/6/21.
 */
public class WeatherServer {

    public static void main(String[] args) {

        Endpoint.publish("http://127.0.0.1:12345/weather",new WeatherInterfaceImpl());
    }
}
