package com.example.MyGitProject.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontoller {
    @GetMapping("/hello")
public String hello(){
        return "Hello from akshat fine";
    }
}
