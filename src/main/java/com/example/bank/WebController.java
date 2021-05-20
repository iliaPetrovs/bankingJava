package com.example.bank;

import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.Map;

@RestController
@RequestMapping("/banking")
public class WebController {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public WebController() {

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/")
    public String home() {
        return "login";
    }

//    @ResponseStatus(HttpStatus.OK)
//    @PostMapping("/")
//    public String login(@RequestBody Map<String,String> keyValuePairs) {
//        System.out.println(keyValuePairs.get("username"));
//        return "login";
//    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/balance")
    public int balance() {
        return 400;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/order")
    public String createStandingOrder() {
        return ("Standing order created");
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/order/{id}")
    public String deleteStandingOrder(@PathVariable("id") Integer id) {
        return ("Standing order deleted " + id);
    }

//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/")
//    public String addAirport(@Valid @RequestBody Airport airport, HttpServletRequest request) {
//        airportList.add(airport);
//        return("Succesfully added airport " + airport.getName());
//    }

}
