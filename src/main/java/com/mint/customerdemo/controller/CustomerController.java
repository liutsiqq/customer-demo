package com.mint.customerdemo.controller;

import com.mint.customerdemo.model.Customer;
import com.mint.customerdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/customer", method = RequestMethod.POST)
    public Customer saveCustomer(Customer customer) {
        return customerService.updateCustomerInfo(customer);
    }

    @RequestMapping(value="/customer/search", method = RequestMethod.GET)
    public List<Customer> searchCustomer(String  firstName) {
        return customerService.findByFirstName(firstName);
    }

}