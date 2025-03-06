package org.example.spring_boot_13.service;

import jakarta.transaction.Transactional;
import org.example.spring_boot_13.dto.ItemDTO;
import org.example.spring_boot_13.entity.Customer;
import org.example.spring_boot_13.entity.Item;
import org.example.spring_boot_13.entity.OrderDetail;
import org.example.spring_boot_13.entity.Orders;
import org.example.spring_boot_13.repo.CustomerRepo;
import org.example.spring_boot_13.repo.ItemRepo;
import org.example.spring_boot_13.repo.OrderRepo;
import org.example.spring_boot_13.repo.PlaceOrderRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class PlaceOrderService {
    @Autowired
    private PlaceOrderRepo placeOrderRepo;

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    ModelMapper modelMapper;


    public List<Integer> getAllItemIDs() {
        System.out.println("get item ids");
        return itemRepo.findAllIds();
    }

    public ItemDTO getAllbyId(int code) {
        System.out.println("sss");
        List<Item> items = placeOrderRepo.findByCode(code);
        Item item = items.get(0);

        return modelMapper.map(item, ItemDTO.class);
    }

    @Transactional
    public boolean placeOrder(int cid, ArrayList<ItemDTO> arrayList, double tot) {
        try {
            Optional<Customer> customer = customerRepo.findById(cid);
            Orders orders = new Orders(tot, customer.get());
            orderRepo.save(orders);

            for (ItemDTO itemDTO : arrayList) {
                OrderDetail orderDetail = new OrderDetail(itemDTO.getQty() * itemDTO.getPrice(), itemDTO.getQty(), itemRepo.findById(itemDTO.getCode()).get(), orders);

                placeOrderRepo.save(orderDetail);


                itemRepo.reduceQTY(itemDTO.getCode(), itemDTO.getQty());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    }
