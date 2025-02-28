package org.example.spring_boot_13.repo;

import org.example.spring_boot_13.entity.Item;
import org.example.spring_boot_13.entity.OrderDetail;
import org.example.spring_boot_13.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlaceOrderRepo extends JpaRepository<OrderDetail, Long> {

    @Query(value = "select * from orders where customer_id = ?1", nativeQuery = true)

    Item getAllbyId(int id);
}
