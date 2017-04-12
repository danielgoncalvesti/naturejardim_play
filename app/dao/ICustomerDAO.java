package dao;

import java.util.List;

import models.entities.Customer;

public interface ICustomerDAO {
    Customer find(Long id);
    void create(Customer c);
    List<Customer> findAll();
}
