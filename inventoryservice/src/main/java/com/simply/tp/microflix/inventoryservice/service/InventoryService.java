package com.simply.tp.microflix.inventoryservice.service;

import com.simply.tp.microflix.persistence.dto.InventoryDetails;
import com.simply.tp.microflix.persistence.entities.Inventory;

import java.util.List;

/**
 * Created by shreeharshashet on 2/6/18.
 */
public interface InventoryService {
    List<InventoryDetails> searchInventory(int inventoryId);
}
