package org.example.spring_boot_13.repo;

import org.example.spring_boot_13.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepo extends JpaRepository<Item, Integer> {
    boolean existsByCode(int code);

    @Query(value = "select id from item", nativeQuery = true)
    List<Integer> findAllIds();

    @Modifying
    @Query(
            value = "update item set qty = qty - ?2 where id = ?1",
            nativeQuery = true
    )
    void reduceQTY(int code, int qty);
}
