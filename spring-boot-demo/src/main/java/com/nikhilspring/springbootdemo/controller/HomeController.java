package com.nikhilspring.springbootdemo.controller;

import com.nikhilspring.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    //@RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1000");
        user.setName("Nikhil");
        user.setEmailId("nikhil@gmail.com");

        return user;
    }

    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id,
                               @PathVariable("id2") String name) {
        return "The path Variable is:" + id + " : " + name;
    }

    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name,
                                @RequestParam(name = "email", required = false, defaultValue = "") String emailId) {
        return "Your name is :" + name + " and EmailId is: " + emailId;
    }
}


