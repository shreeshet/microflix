package com.simply.tp.microflix.userservice.service;

import com.simply.tp.microflix.userservice.dto.CustomerDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.Assert.*;

/**
 * Created by shreeharshashet on 6/15/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testSearchCustomer() throws Exception {
        CustomerDTO u = userService.searchCustomer("mary");
    }

    @Test
    public void testGetCustomerById() throws Exception {
        CustomerDTO u = userService.getCustomerById(1);
    }
}