package com.spring.batch.Configuration;

import com.spring.batch.Model.Customer;
import org.springframework.batch.item.ItemProcessor;

/**
 * @author Chander Parkash
 * June 07 2023
 */
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
