package com.example.mmmspringboot.controllers;

import com.example.mmmspringboot.model.ShippingAddress;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    public ShippingAddress getShippingAddress(){
        return new ShippingAddress();
    }
}
