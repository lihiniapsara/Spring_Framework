package org.example.spring_boot_13.service;

import org.example.spring_boot_13.dto.ItemDTO;
import org.example.spring_boot_13.entity.Item;
import org.example.spring_boot_13.repo.ItemRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ItemRepo itemRepo;

    public boolean saveItem(ItemDTO ItemDTO) {
        /*if (itemRepo.existsByCode(ItemDTO.getCode())) {
            return false;
        }*/
        //Item item = new Item(ItemDTO.getCode(), ItemDTO.getDescription(), ItemDTO.getPrice());
        itemRepo.save(modelMapper.map(ItemDTO, Item.class));
        return true;
    }

    public ArrayList<ItemDTO> getAllItems() {
        System.out.println("22");
        /*ArrayList<ItemDTO> itemDTOS = new ArrayList<>();
        itemRepo.findAll().forEach(item -> itemDTOS.add(new ItemDTO(item.getCode(), item.getDescription(), item.getPrice())));
*/        return modelMapper.map(itemRepo.findAll(), new TypeToken<List<ItemDTO>>() {
        }.getType());
    }

    public void deleteItem(int id) {
        /*if (itemRepo.existsById(id)) {
            itemRepo.deleteById(id);
            return true;
        }
        return false;*/
        itemRepo.deleteById(id);
    }

    
}
