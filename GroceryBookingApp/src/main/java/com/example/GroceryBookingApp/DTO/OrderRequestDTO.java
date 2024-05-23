package com.example.GroceryBookingApp.DTO;

import java.util.List;

public class OrderRequestDTO {

    private List<OrderItemRequestDTO> items;

    public OrderRequestDTO() {
    }

    public OrderRequestDTO(List<OrderItemRequestDTO> items) {
        this.items = items;
    }

    public List<OrderItemRequestDTO> getItems() {
        return items;
    }

    public void setItems(List<OrderItemRequestDTO> items) {
        this.items = items;
    }
}
