package com.simply.tp.microflix.persistence.dao;

import com.simply.tp.microflix.persistence.entities.Inventory;

import java.util.List;

/**
 * Created by shreeharshashet on 2/7/18.
 */
public interface InventorySeviceDAO {
    public List<Inventory> searchInventory(int filmId);
}
