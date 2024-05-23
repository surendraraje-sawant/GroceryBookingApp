package com.example.GroceryBookingApp.DTO;

import org.springframework.stereotype.Component;

@Component
public class GroceryItemDTO {
    private String name;
    private String description;
    private double price;
    private int inventory;

    public GroceryItemDTO() {
    }

    public GroceryItemDTO(String name, String description, double price, int inventory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
