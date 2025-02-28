package org.example.spring_boot_13.repo;

import org.example.spring_boot_13.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    //boolean existsByName(String name);
    boolean existsById(int id);
@Query(value = "SELECT id FROM customer", nativeQuery = true)
    List<Long> findAllIds();
@Query(value = "SELECT name FROM customer WHERE id = :id", nativeQuery = true)
    String getCustomersById(int id);

    /*List<Customer> findByAddress(String address);
    List<Customer> readCustomerByAddress(String address);
    List<Customer> getCustomersByName(String name);
    long countCustomerById(int id);
    boolean existsCustomerByAddress(String address);

    @Query(value = "SELECT * FROM customer", nativeQuery = true)
    List<Customer> getAllCustomers();

    @Query(value = "SELECT * FROM customer WHERE name = ?1", nativeQuery = true)
    Customer searchCustomerByName(String name);*/
}
