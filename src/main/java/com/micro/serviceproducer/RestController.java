package com.micro.serviceproducer;

import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/controller")
public class RestController {

    @RequestMapping("/get")
    @GetMapping
    public String get() {
        return "Hello Rest";
    }

    @RequestMapping("/put/{value}")
    @PutMapping
    public void putPath(@PathVariable("value") String value) {
        System.out.println(value);
    }

    @RequestMapping("/put/")
    @PutMapping
    public void put(@RequestParam("value") String value) {
        System.out.println(value);
    }

    @RequestMapping("/getCustomer")
    @GetMapping
    public Customer getCustomer() {
        return Customer.builder().age(25).name("Mazlum").surName("Havutcu").build();
    }
}
