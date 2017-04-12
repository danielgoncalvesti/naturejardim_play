package dao;

import java.util.List;

import models.entities.Product;
import play.db.jpa.JPA;

public class ProductJpaDaoImpl implements IProductDAO {

	@Override
	public void create(Product p) {
		JPA.em().persist(p);	
	}

	@Override
	public List<Product> findAll() {
		List <Product> products = JPA.em().createNamedQuery("Product.findAll").getResultList();
		return products;
	}

	@Override
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

