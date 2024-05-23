package com.example.GroceryBookingApp.Service;

import com.example.GroceryBookingApp.DTO.OrderItemRequestDTO;
import com.example.GroceryBookingApp.DTO.OrderRequestDTO;
import com.example.GroceryBookingApp.Entity.GroceryItemEntity;
import com.example.GroceryBookingApp.Entity.OrderEntity;
import com.example.GroceryBookingApp.Entity.OrderItemEntity;
import com.example.GroceryBookingApp.Repository.GroceryItemRepository;
import com.example.GroceryBookingApp.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public OrderEntity createOrder(OrderRequestDTO orderRequest) {

        OrderEntity order = new OrderEntity();
        order.setOrderDate(LocalDateTime.now());

        List<OrderItemEntity> orderItems = new ArrayList<>();
        for (OrderItemRequestDTO itemRequest : orderRequest.getItems()) {
            GroceryItemEntity groceryItem = groceryItemRepository.findById(itemRequest.getGroceryItemId()).orElseThrow();
            OrderItemEntity orderItem = new OrderItemEntity();
            orderItem.setGroceryItem(groceryItem);
            orderItem.setQuantity(itemRequest.getQuantity());
            orderItems.add(orderItem);
        }

        order.setOrderItems(orderItems);
        return orderRepository.save(order);
    }
}
