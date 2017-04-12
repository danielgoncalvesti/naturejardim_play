package dao;

import java.util.List;

import models.entities.Customer;
import play.db.jpa.JPA;

public class CustomerJpaDaoImpl implements ICustomerDAO {

	@Override
	public Customer find(Long idCustomer) {
		return JPA.em().find(Customer.class, idCustomer);
	}

	@Override
	public void create(Customer c) {
		JPA.em().persist(c);
	}

	@Override
	public List<Customer> findAll() {
		return JPA.em().createNamedQuery("Customer.findAll").getResultList();	
	}

}
