package com.mint.customerdemo.service;

import com.mint.customerdemo.model.Customer;
import com.mint.customerdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer updateCustomerInfo(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> findByFirstName(String firstName){
        return customerRepository.findAllByFirstName(firstName);
    }
}
