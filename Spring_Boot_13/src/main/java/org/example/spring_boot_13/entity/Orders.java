package org.example.spring_boot_13.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.spring_boot_13.entity.Customer;
import org.example.spring_boot_13.entity.OrderDetail;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Orders(double total, Customer customer) {
        this.total = total;
        this.customer = customer;
    }

    private double total;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> odList;
}
