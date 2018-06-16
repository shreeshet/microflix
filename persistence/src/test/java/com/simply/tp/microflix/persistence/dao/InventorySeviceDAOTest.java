package com.simply.tp.microflix.persistence.dao;

import com.simply.tp.microflix.persistence.entities.Inventory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by shreeharshashet on 6/15/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class InventorySeviceDAOTest {

    @Autowired
    InventorySeviceDAO inventorySeviceDAO;

    @Test
    public void testSearchInventory() throws Exception {
        List<Inventory> li = inventorySeviceDAO.searchInventory(100);
        System.out.println(li.size());
    }
}