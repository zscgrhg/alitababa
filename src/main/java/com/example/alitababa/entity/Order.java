package com.example.alitababa.entity;

import lombok.Data;

@Data
public class Order {
    Long id;
    int amount;
    String itemName;
}
