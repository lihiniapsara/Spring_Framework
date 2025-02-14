package org.example.spring_boot_13.repo;

import org.example.spring_boot_13.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Integer> {
    boolean existsByCode(int code);
}
