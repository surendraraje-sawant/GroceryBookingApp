package com.example.GroceryBookingApp.Controller;

import com.example.GroceryBookingApp.DTO.OrderRequestDTO;
import com.example.GroceryBookingApp.Entity.OrderEntity;
import com.example.GroceryBookingApp.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderRequestDTO orderRequest) {
        OrderEntity order = orderService.createOrder(orderRequest);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }
}
