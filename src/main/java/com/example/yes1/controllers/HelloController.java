package com.example.yes1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET method to return a simple greeting
    @GetMapping("/greet")
    public String
    greet() {
        return "Hello, World!";
    }

    // POST method to receive and return a greeting with a custom name
    @PostMapping("/greet")
    public String greetWithCustomName(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // PUT method to update a greeting message
    @PutMapping("/greet/{id}")
    public String updateGreeting(@PathVariable Long id, @RequestParam String newMessage) {
        // Perform the update logic here (e.g., update a database record)
        return "Greeting with ID " + id + " updated to: " + newMessage;
    }

    // DELETE method to delete a greeting
    @DeleteMapping("/greet/{id}")
    public String deleteGreeting(@PathVariable Long id) {
        // Perform the deletion logic here (e.g., delete a database record)
        return "Greeting with ID " + id + " deleted";
    }
}

