package com.api.calculator.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CalculatorController {
    @GetMapping("/test")
    public String test() {
        return "Calculator Application is running...";
    }
    
    
   @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        return "The sum of " + a + " and " + b + " is " + sum;
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        int difference = a - b;
        return "The difference between " + a + " and " + b + " is " + difference;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        int product = a * b;
        return "The product of " + a + " and " + b + " is " + product;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return "Cannot divide by zero!";
        }
        int quotient = a / b;
        return "The quotient of " + a + " and " + b + " is " + quotient;        
    }
}
