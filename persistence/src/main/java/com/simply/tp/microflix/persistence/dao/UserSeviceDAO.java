package com.simply.tp.microflix.persistence.dao;

import com.simply.tp.microflix.persistence.entities.Customer;

/**
 * Created by shreeharshashet on 2/7/18.
 */
public interface UserSeviceDAO {
    public Customer searchCustomer(String firs_name);

    public Customer getCustomerById(int customerId);
}
