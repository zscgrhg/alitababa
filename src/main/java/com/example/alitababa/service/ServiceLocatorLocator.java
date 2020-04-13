package com.example.alitababa.service;

public class ServiceLocatorLocator {
    public static ServiceLocator findServiceLocator() {
        return new ServiceLocator();
    }
    public static boolean compute(int x,int y) {
        return x > y;
    }
}
