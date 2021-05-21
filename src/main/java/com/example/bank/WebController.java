package com.example.bank;

import models.StandingOrder;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/banking")
public class WebController {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    List<StandingOrder> standingOrders = new ArrayList<>();


    public WebController() {
        standingOrders.add(new StandingOrder(20, 1220 , "Derrick Derrickson", "Weekly"));
        standingOrders.add(new StandingOrder(120, 3991, "The McRib", "Never"));
    }

//    @CrossOrigin(origins = "http://localhost:8080")
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
    public String createStandingOrder(@RequestBody StandingOrder standingOrder) {
        standingOrders.add(standingOrder);
        return ("Standing order added");
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/order")
    public List<StandingOrder> allStandingOrders() {
        return standingOrders;
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/order/{id}")
    public void deleteStandingOrder(@PathVariable("id") Integer id) {
        for (StandingOrder order : standingOrders) {
            if (order.getRecipientId() == id) {
                standingOrders.remove(order);
            } else {
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Doesn't exist"
                );
            }
        }
    }

//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/")
//    public String addAirport(@Valid @RequestBody Airport airport, HttpServletRequest request) {
//        airportList.add(airport);
//        return("Succesfully added airport " + airport.getName());
//    }

}
