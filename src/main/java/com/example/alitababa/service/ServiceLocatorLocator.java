package com.example.alitababa.service;

public class ServiceLocatorLocator {
    public static ServiceLocator findServiceLocator() {
        return new ServiceLocator();
    }
    public static int testStaic(int x,int y) {
        return x+y;
    }
}
