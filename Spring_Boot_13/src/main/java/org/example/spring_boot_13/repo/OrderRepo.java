package org.example.spring_boot_13.repo;

import org.example.spring_boot_13.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders, Long> {
}
