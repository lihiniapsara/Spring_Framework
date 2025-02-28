package org.example.spring_boot_13.controller;

import org.example.spring_boot_13.dto.ItemDTO;
import org.example.spring_boot_13.dto.OrderDetailDTO;
import org.example.spring_boot_13.service.CustomerService;
import org.example.spring_boot_13.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/placeOrder")
public class PlaceOrderController {

    @Autowired
    private PlaceOrderService placeOrderService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getCIDs")
    public List<Long> getCustomerIDs(){
        return customerService.getAllIds();

    }


    @GetMapping("/getAllItemIDs")
    public List<Integer> getAllItemIDs(){
        return placeOrderService.getAllItemIDs();
    }

    @GetMapping("/getAllbyId/{id}")
    public ItemDTO getAllbyId(@PathVariable int id){
        return placeOrderService.getAllbyId(id);

    }

    @PostMapping("/save")
    public ResponseEntity saveOrder(@RequestBody OrderDetailDTO dto){
        try {
            System.out.println(dto.getCid()+" "+dto.getArrayList());

            for (ItemDTO itemDTO : dto.getArrayList()) {
                System.out.println("Full Total :" + dto.getTot());

            }
            boolean result = placeOrderService.placeOrder((int) dto.getCid(),dto.getArrayList(),dto.getTot());
            if (result) {
                return new ResponseEntity("Order Saved Successfully!!!", HttpStatus.ACCEPTED);
            }else {
                return new ResponseEntity("Order Saved Unsuccessfully!!!!!!",HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}