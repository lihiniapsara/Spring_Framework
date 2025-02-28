package org.example.controller;

import org.example.dto.ItemDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/v1/item")
public class ItemController {
    private ArrayList<ItemDTO> items = new ArrayList<>();

    // Get all items
    @GetMapping(path = "getAll")
    public ArrayList<ItemDTO> getAllItems() {
        return items;
    }

    // Save a new item
    @PostMapping("save")
    public ItemDTO addItem(@RequestBody ItemDTO itemDTO) {
        items.add(itemDTO);
        return itemDTO;
    }

    // Update an existing item
    @PutMapping("update")
    public ItemDTO updateItem(@RequestBody ItemDTO itemDTO) {
        for (int i = 0; i < items.size(); i++) {
            ItemDTO existingItem = items.get(i);
            if (existingItem.getCode().equals(itemDTO.getCode())) {
                existingItem.setDescription(itemDTO.getDescription());
                existingItem.setPrice(itemDTO.getPrice());
                return existingItem;
            }
        }
        return itemDTO;
    }

    // Delete an item by ID
    @DeleteMapping("delete/{code}")
    public boolean deleteItem(@PathVariable("code") String code) {
        for (int i = 0; i < items.size(); i++) {
            ItemDTO existingItem = items.get(i);
            if (existingItem.getCode().equals(code)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }
}
