package dao;

import java.util.List;

import models.entities.Customer;

public interface ICustomerDAO {
    Customer find(Long id);
    void create(Customer c);
    void update(Customer c);
    boolean delete(Long id);
    List<Customer> findAll();
    
}
