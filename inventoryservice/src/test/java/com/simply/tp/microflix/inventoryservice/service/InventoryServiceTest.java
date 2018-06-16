package com.simply.tp.microflix.inventoryservice.service;


import com.simply.tp.microflix.inventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by shreeharshashet on 6/16/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class InventoryServiceTest {

    @Autowired
    InventoryService inventoryService;

    @Test
    public void testSearchInventory() throws Exception {
        inventoryService.searchInventory(100);
    }
}