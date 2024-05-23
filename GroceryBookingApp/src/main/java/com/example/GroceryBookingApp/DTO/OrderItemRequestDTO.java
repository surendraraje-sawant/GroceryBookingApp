package com.example.GroceryBookingApp.DTO;

public class OrderItemRequestDTO {
    private Long groceryItemId;
    private int quantity;

    public OrderItemRequestDTO() {
    }

    public OrderItemRequestDTO(Long groceryItemId, int quantity) {
        this.groceryItemId = groceryItemId;
        this.quantity = quantity;
    }

    public Long getGroceryItemId() {
        return groceryItemId;
    }

    public void setGroceryItemId(Long groceryItemId) {
        this.groceryItemId = groceryItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
