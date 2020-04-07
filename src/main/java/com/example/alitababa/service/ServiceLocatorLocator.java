package com.example.alitababa.service;

import com.zte.sputnik.parse.annotation.TestSubject;
import org.springframework.stereotype.Service;

@Service
@TestSubject
public class ServiceLocatorLocator {
    public ServiceLocator findServiceLocator() {
        return new ServiceLocator();
    }
}
