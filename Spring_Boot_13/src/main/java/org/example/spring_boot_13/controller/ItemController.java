package org.example.spring_boot_13.controller;

import org.example.spring_boot_13.dto.ItemDTO;
import org.example.spring_boot_13.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("save")
    public boolean saveItem(@RequestBody ItemDTO ItemDTO) {
        boolean isSaved = itemService.saveItem(ItemDTO);
        return isSaved;
    }

    @GetMapping("getAll")
    public ArrayList<ItemDTO> getAllItems() {
        System.out.println("11");
        return itemService.getAllItems();
    }

    @DeleteMapping("delete/{id}")
    public String deleteItem(@PathVariable int id) {
        itemService.deleteItem(id);
        return "Item Deleted with id " + id;
    }

    @PutMapping("update")
    public String updateItem(@RequestBody ItemDTO itemDTO) {
        itemService.saveItem(itemDTO);
        return itemDTO.toString();
    }


}
