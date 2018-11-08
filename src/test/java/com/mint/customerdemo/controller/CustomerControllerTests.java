package com.mint.customerdemo.controller;


import com.mint.customerdemo.model.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.ModelMap;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@SpringApplicationConfiguration(classes = MallCoreServiceApplication.class)//这个已过时
@WebAppConfiguration
public class CustomerControllerTests {
    @Autowired
    private CustomerController customerController;

    @Test
    public void testAddCustomer(){
        Customer customer1 = new Customer();
        customer1.setFirstName("first1");
        customer1.setLastName("last1");
        customer1.setAddress("address1");
        customerController.saveCustomer(customer1);

        List<Customer> customerList = customerController.searchCustomer("first1");
        assertEquals(customerList.get(0), customer1);
    }


}
