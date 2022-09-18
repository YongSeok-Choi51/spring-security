package com.example.security;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SecurityController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "welcome!";
    }

    @GetMapping("/loginPage")
    public String login() {
        return "loginPage.html";
    }
}
