package com.simply.tp.microflix.inventoryservice.service;

import com.simply.tp.microflix.persistence.entities.Inventory;

import java.util.List;

/**
 * Created by shreeharshashet on 2/6/18.
 */
public interface InventoryService {
    List<Inventory> searchInventory(int inventoryId);
}
