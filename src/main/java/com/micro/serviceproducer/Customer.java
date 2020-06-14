package com.micro.serviceproducer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    private String name;
    private String surName;
    private int age;
}
