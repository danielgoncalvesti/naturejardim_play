package dao;

import java.util.List;

import models.entities.Product;

public interface IProductDAO {
	void create(Product p);
	List<Product> findAll();
	Product findById(Long id);
	
}
