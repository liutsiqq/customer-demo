package com.mint.customerdemo.repository;


import com.mint.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //This method shouldn't be exposed to end-user, for customerId can be guessed.
    //Customer findCustomerById(Long id);

    List<Customer> findAllByFirstName(String firstName);

}
