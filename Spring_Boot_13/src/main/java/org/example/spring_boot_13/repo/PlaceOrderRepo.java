package org.example.spring_boot_13.repo;

import org.example.spring_boot_13.entity.Item;
import org.example.spring_boot_13.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaceOrderRepo extends JpaRepository<OrderDetail, Long> {

    @Query(value = "select * from orders where customer_id = ?1", nativeQuery = true)

    Item getAllbyId(int id);
    @Query(value = "SELECT * FROM item WHERE code = :code", nativeQuery = true)
    List<Item> findByCode(@Param("code") int code);


}
