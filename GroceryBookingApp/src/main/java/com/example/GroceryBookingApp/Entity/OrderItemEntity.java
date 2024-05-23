package com.example.GroceryBookingApp.Entity;

import jakarta.persistence.*;

@Entity
public class OrderItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private GroceryItemEntity groceryItem;

    private int quantity;

    public OrderItemEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GroceryItemEntity getGroceryItem() {
        return groceryItem;
    }

    public void setGroceryItem(GroceryItemEntity groceryItem) {
        this.groceryItem = groceryItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
