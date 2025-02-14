package org.example.spring_boot_13.dto;

public class ItemDTO {
    private int code;
    private String description;
    private double price;

    public ItemDTO(int code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public ItemDTO() {
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
}
