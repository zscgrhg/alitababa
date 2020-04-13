package com.example.alitababa.service;

import org.springframework.stereotype.Service;

@Service

public class ServiceLocator {
    public WeatherService findWeatherService() {
        return new WeatherServiceImpl();
    }
}
