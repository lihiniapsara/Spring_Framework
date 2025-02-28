package org.example.spring_boot_13.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Item {
    @Id
    private int code;
    private String description;
    private double price;
    private int qty;

    public Item(int code, String description, double price, int qty, List<OrderDetail> ordersList) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.qty = qty;
        this.ordersList = ordersList;
    }

    @OneToMany(mappedBy = "item")
    private List<OrderDetail> ordersList;


    public Item() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public List<OrderDetail> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<OrderDetail> ordersList) {
        this.ordersList = ordersList;
    }
}
