package com.example.alitababa.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class WeatherServiceImpl implements WeatherService{
    RestTemplate template=new RestTemplate();
    @Override
    public String getWeather() {

        ResponseEntity<String> weather = template.getForEntity("https://www.baidu.com/s?ie=utf-8&mod=1&isbd=1&isid=8ad7c0fa0001798b&ie=utf-8&f=8&rsv_bp=1&rsv_idx=1&tn=monline_3_dg&wd=%E6%B7%B1%E5%9C%B3%20%E5%A4%A9%E6%B0%94&oq=%25E6%25B7%25B1%25E5%259C%25B3%2520%25E5%25A4%25A9%25E6%25B0%2594&rsv_pq=8ad7c0fa0001798b&rsv_t=90f5Mwo%2Bmr7xK%2B5CZVuFRL3k%2F%2Bph1epYMRdBNApO9KiJvQHLZOIGuR5EnKEw%2FwJWcJB2&rqlang=cn&rsv_enter=0&rsv_dl=tb&bs=%E6%B7%B1%E5%9C%B3%20%E5%A4%A9%E6%B0%94&rsv_sid=1465_21125&_ss=1&clist=42b6f6d6aa1c6eab%091c2801087a540d9a%0930a9027ccaa3cb32&hsug=&f4s=1&csor=3&_cr1=35581", String.class);
        return weather.getStatusCode().toString();
    }
}
