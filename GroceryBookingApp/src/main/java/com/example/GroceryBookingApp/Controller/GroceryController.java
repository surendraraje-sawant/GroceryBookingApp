package com.example.GroceryBookingApp.Controller;

import com.example.GroceryBookingApp.Entity.GroceryItemEntity;
import com.example.GroceryBookingApp.Service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grocery")
public class GroceryController {
    @Autowired
    private GroceryItemService groceryItemService;

    @GetMapping
    public List<GroceryItemEntity> getAllGroceryItems() {
        return groceryItemService.getAllGroceryItems();
    }
}
