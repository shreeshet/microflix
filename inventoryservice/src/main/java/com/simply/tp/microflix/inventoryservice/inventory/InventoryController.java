package com.simply.tp.microflix.inventoryservice.inventory;

import com.simply.tp.microflix.inventoryservice.dto.InventoryDetails;
import com.simply.tp.microflix.inventoryservice.service.InventoryServiceImpl;
import com.simply.tp.microflix.persistence.entities.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by shreeharshashet on 2/6/18.
 */
@RestController
public class InventoryController {
    protected Logger logger = LoggerFactory.getLogger(InventoryController.class);


    @Autowired
    InventoryServiceImpl inventoryService;

    @RequestMapping(value="/hello/{name}",method=RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name){
        return "Hello "+ name;
    }

    @RequestMapping(value="/inventory/{fid}",method=RequestMethod.GET)
    public List<Inventory> getFileById(@PathVariable("fid") int fid){
        return inventoryService.searchInventory(fid);
    };


}
