package com.spring.batch.Repository;

import com.spring.batch.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Chander Parkash
 * June 07 2023
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
