package com.simply.tp.microflix.userservice.service;

import com.simply.tp.microflix.persistence.dao.UserSeviceDAO;
import com.simply.tp.microflix.persistence.entities.Customer;
import com.simply.tp.microflix.userservice.dto.CustomerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shreeharshashet on 6/7/18.
 */
@Component
public class UserServiceImpl implements UserService, UserDetailsService {


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

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Customer cus = userSeviceDAO.searchCustomer(s);

        if(cus == null){
            throw new UsernameNotFoundException(String.format("The username %s doesn't exist", s));
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        UserDetails userDetails = new org.springframework.security.core.userdetails.
                User(cus.getFirstName(), "{noop}"+cus.getFirstName(), authorities);

        return userDetails;
    }
}
