package com.simply.tp.microflix.persistence.dao;

import com.simply.tp.microflix.persistence.entities.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by shreeharshashet on 6/15/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserSeviceDAOTest {

    @Autowired
    UserSeviceDAO userSeviceDAO;

    @Test
    public void testSearchCustomer() throws Exception {
        Customer u = userSeviceDAO.searchCustomer("mary");
        System.out.println(u);
    }

    @Test
    public void testGetCustomerById() throws Exception {
        Customer u = userSeviceDAO.getCustomerById(1);
    }
}