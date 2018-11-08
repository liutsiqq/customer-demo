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
    public void testCreateCustomer(){
        Customer customer1 = new Customer();
        customer1.setFirstName("first1");
        customer1.setLastName("last1");
        customer1.setAddress("address1");
        customerController.saveCustomer(customer1);

        List<Customer> customerList = customerController.searchCustomer("first1");
        assert(customerList.size()>0);
    }

    @Test
    public void testUpdateCustomer(){
        Customer customer1 = new Customer();
        customer1.setFirstName("first1");
        customer1.setLastName("last1");
        customer1.setAddress("address1");
        customerController.saveCustomer(customer1);

        List<Customer> customerList1 = customerController.searchCustomer("first1");
        assert(customerList1.size()>0);

        Customer customer2 = customerList1.get(0);
        customer2.setLastName("last2");
        customerController.saveCustomer(customer2);

        List<Customer> customerList2 = customerController.searchCustomer("first1");
        assert(customerList2.size()>0);
    }

    @Test
    public void testDeleteCustomer(){
        customerController.deleteCustomer("first1");

        List<Customer> customerList = customerController.searchCustomer("first1");
        assert(customerList==null || customerList.size()==0);
    }

}
