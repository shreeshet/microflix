package com.simply.tp.microflix.userservice.service;

import com.simply.tp.microflix.persistence.dao.UserSeviceDAO;
import com.simply.tp.microflix.persistence.entities.Customer;
import com.simply.tp.microflix.userservice.dto.CustomerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by shreeharshashet on 6/7/18.
 */
@Component
public class UserServiceImpl implements UserService {


    @Autowired
    UserSeviceDAO userSeviceDAO;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public CustomerDTO searchCustomer(String firs_name) {
        Customer cus = userSeviceDAO.searchCustomer(firs_name);
        return modelMapper.map(cus, CustomerDTO.class);
    }

    @Override
    public CustomerDTO getCustomerById(int customerId) {
        Customer cus = userSeviceDAO.getCustomerById(customerId);
        return modelMapper.map(cus,CustomerDTO.class);
    }
}
