package com.simply.tp.microflix.inventoryservice.service;

import com.simply.tp.microflix.persistence.entities.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.simply.tp.microflix.persistence.dao.InventorySeviceDAO;

import java.util.List;

/**
 * Created by shreeharshashet on 2/7/18.
 */
@Component
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    InventorySeviceDAO movieSeviceDAO;


    public List<Inventory> searchInventory(int inventoryId){
        return movieSeviceDAO.searchInventory(inventoryId);
    }
}
