package dao;

import java.util.List;

import models.entities.Customer;
import play.Logger;
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
	public void update(Customer c) {
		JPA.em().merge(c);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAll() {
		return JPA.em().createNamedQuery("Customer.findAll").getResultList();	
	}

	@Override
	public boolean delete(Long id) {
		Customer c = JPA.em().find(Customer.class, id);
		try{
			JPA.em().remove(c);
			return true;
		}catch (Exception e){
			Logger.error("Erro: "+ e.toString());
			return false;
		}
		
	}


}
