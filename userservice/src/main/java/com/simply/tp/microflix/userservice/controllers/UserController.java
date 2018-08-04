package com.simply.tp.microflix.userservice.controllers;


import com.simply.tp.microflix.userservice.dto.CustomerDTO;
import com.simply.tp.microflix.userservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shreeharshashet on 2/6/18.
 */
@RestController
public class UserController {
    protected Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value="/first_name/{name}",method=RequestMethod.GET)
    public CustomerDTO getCustomerByFirstName(@PathVariable("name")String firs_name){
        logger.debug("in getCustomerByFirstName ...." + firs_name);
        return userService.searchCustomer(firs_name);
    };

    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public CustomerDTO getCustomer(@PathVariable("id") int customerId){
        return userService.getCustomerById(customerId);
    };

}
