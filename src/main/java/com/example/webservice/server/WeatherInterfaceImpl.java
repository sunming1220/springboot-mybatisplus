package com.example.webservice.server;

import javax.jws.WebService;

/**
 * Created by sunming on 2019/6/21.
 */
@WebService
public class WeatherInterfaceImpl implements WeatherInterface{
    @Override
    public String queryWeather(String cityName) {
        System.out.println("获取城市名:"+cityName);
        String weather = "暴雨";
        return weather;
    }
}
