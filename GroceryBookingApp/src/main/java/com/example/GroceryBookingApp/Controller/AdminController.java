package com.example.GroceryBookingApp.Controller;

import com.example.GroceryBookingApp.DTO.GroceryItemDTO;
import com.example.GroceryBookingApp.Entity.GroceryItemEntity;
import com.example.GroceryBookingApp.Service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/grocery")
public class AdminController {
    @Autowired
    private GroceryItemService groceryItemService;

    @GetMapping
    public List<GroceryItemEntity> getAllGroceryItems() {
        return groceryItemService.getAllGroceryItems();
    }

    @PostMapping
    public ResponseEntity<GroceryItemEntity> addGroceryItem(@RequestBody GroceryItemDTO groceryItemDTO) {
        GroceryItemEntity groceryItem = groceryItemService.addGroceryItem(groceryItemDTO);
        return new ResponseEntity<>(groceryItem, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroceryItem(@PathVariable Long id) {
        groceryItemService.deleteGroceryItem(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GroceryItemEntity> updateGroceryItem(@PathVariable Long id, @RequestBody GroceryItemDTO groceryItemDTO) {
        GroceryItemEntity updatedItem = groceryItemService.updateGroceryItem(id, groceryItemDTO);
        return new ResponseEntity<>(updatedItem, HttpStatus.OK);
    }

    @PatchMapping("/{id}/inventory")
    public ResponseEntity<GroceryItemEntity> updateInventory(@PathVariable Long id, @RequestBody Map<String, Integer> inventory) {
        int quantity = inventory.get("quantity");
        GroceryItemEntity updatedItem = groceryItemService.updateInventory(id, quantity);
        return new ResponseEntity<>(updatedItem, HttpStatus.OK);
    }

}
