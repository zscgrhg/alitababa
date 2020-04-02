package com.example.alitababa.mapper;

import java.lang.reflect.Type;

public interface UUMapper extends UserMapper{
    public static void main(String[] args) {
        Type[] genericInterfaces = UUMapper.class.getGenericInterfaces();

        for (Type genericInterface : genericInterfaces) {
            System.out.println(genericInterface);
        }

        System.out.println(genericInterfaces);
    }
}
