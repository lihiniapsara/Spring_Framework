package org.example.spring_boot_13.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemDTO {
    private int code;
    private String description;
    private double price;
    private int qty;

    public ItemDTO(int code, int qty, double price) {
        this.code = code;
        this.qty = qty;
        this.price = price;
    }

}
