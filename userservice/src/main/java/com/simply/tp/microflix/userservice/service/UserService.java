package com.simply.tp.microflix.userservice.service;

import com.simply.tp.microflix.userservice.dto.CustomerDTO;



/**
 * Created by shreeharshashet on 6/7/18.
 */
public interface UserService {
    CustomerDTO searchCustomer(String firs_name);
    CustomerDTO getCustomerById(int customerId);

}
