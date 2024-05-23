package com.example.GroceryBookingApp.Service;


import com.example.GroceryBookingApp.DTO.GroceryItemDTO;
import com.example.GroceryBookingApp.Entity.GroceryItemEntity;
import com.example.GroceryBookingApp.Repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryItemService {
    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public List<GroceryItemEntity> getAllGroceryItems() {
        return groceryItemRepository.findAll();
    }

    public GroceryItemEntity addGroceryItem(GroceryItemDTO groceryItemDTO) {
        GroceryItemEntity item = new GroceryItemEntity();
        item.setName(groceryItemDTO.getName());
        item.setDescription(groceryItemDTO.getDescription());
        item.setPrice(groceryItemDTO.getPrice());
        item.setInventory(groceryItemDTO.getInventory());
        return groceryItemRepository.save(item);
    }

    public void deleteGroceryItem(Long id) {
        groceryItemRepository.deleteById(id);
    }

    public GroceryItemEntity updateGroceryItem(Long id, GroceryItemDTO groceryItemDTO) {
        GroceryItemEntity item = groceryItemRepository.findById(id).orElseThrow();
        item.setName(groceryItemDTO.getName());
        item.setDescription(groceryItemDTO.getDescription());
        item.setPrice(groceryItemDTO.getPrice());
        item.setInventory(groceryItemDTO.getInventory());
        return groceryItemRepository.save(item);
    }

    public GroceryItemEntity updateInventory(Long id, int quantity) {
        GroceryItemEntity item = groceryItemRepository.findById(id).orElseThrow();
        item.setInventory(quantity);
        return groceryItemRepository.save(item);
    }


}
