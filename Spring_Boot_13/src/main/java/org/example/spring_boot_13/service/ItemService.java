package org.example.spring_boot_13.service;

import org.example.spring_boot_13.dto.ItemDTO;
import org.example.spring_boot_13.entity.Item;
import org.example.spring_boot_13.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;

    public boolean saveItem(ItemDTO ItemDTO) {
        if (itemRepo.existsByCode(ItemDTO.getCode())) {
            return false;
        }
        Item item = new Item(ItemDTO.getCode(), ItemDTO.getDescription(), ItemDTO.getPrice());
        itemRepo.save(item);
        return true;
    }

    public ArrayList<ItemDTO> getAllItems() {
        ArrayList<ItemDTO> itemDTOS = new ArrayList<>();
        itemRepo.findAll().forEach(item -> itemDTOS.add(new ItemDTO(item.getCode(), item.getDescription(), item.getPrice())));
        return itemDTOS;
    }

    public boolean deleteItem(int id) {
        if (itemRepo.existsById(id)) {
            itemRepo.deleteById(id);
            return true;
        }
        return false;
    }

    
}
