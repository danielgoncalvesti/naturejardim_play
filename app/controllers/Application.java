package controllers;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import dao.CustomerJpaDaoImpl;
import dao.EntryJpaDaoImpl;
import dao.ICustomerDAO;
import dao.IEntryDAO;
import dao.IProductDAO;
import dao.ProductJpaDaoImpl;
import models.entities.Customer;
import models.entities.Entry;
import models.entities.Product;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
	
	static ICustomerDAO customerDao = new CustomerJpaDaoImpl();
	static IEntryDAO entryDao = new EntryJpaDaoImpl();
	static IProductDAO productDao = new ProductJpaDaoImpl();
	

	@Transactional
    public Result index() {
		
//		Product terra = new Product("Terra Adubada", 30.00);
//		Product areia = new Product("Areia branca", 20.00);
//		
//		productDao.create(terra);
//		productDao.create(areia);
//
//		
        Customer c = new Customer("Predio X");
        customerDao.create(c);    
        Customer c1 = new Customer("Predio 2");
        customerDao.create(c1);    
//        
//        Entry entrada = new Entry();
//        entrada.addPaymentCustomer(c1, 500, new Date());
//        entryDao.add(entrada);
//
//        
//        Entry entrada1 = new Entry();
//        entrada1.discountValue(c, terra, 1, new Date());
//
//        entryDao.add(entrada1);
//        
//        Entry entrada2 = new Entry(c1);
//        entrada2.discountValue(c1, areia, 2.5, new Date());
//        entryDao.add(entrada2);        
        
    	return ok(views.html.customer.index.render("Nature Jardim"));
    }
    
	@Transactional
	public Result entriesByIdCustomer(Long id){
//		List<Entry> listEntries = JPA.em().createNamedQuery("Entry.findByCustomer").setParameter("idCustomer", id).getResultList();	

		return ok(Json.toJson(entryDao.findByCustomer(id)));
	}
	
    @Transactional
    public Result customerById(Long id){
        Customer c = customerDao.find(id);
        if (c == null){
        	return badRequest(Json.toJson("Não existe"));
        }
        return ok(Json.toJson(c));
//        return TODO;
    }
    
    @Transactional(readOnly=true)
    public Result listCustomers(){
    	List<Customer> listCustomer = customerDao.findAll();
    	return ok(Json.toJson(listCustomer));
    }
    
    @Transactional(readOnly=true)
    public Result listProducts(){
    	List<Product> listProducts = productDao.findAll();
    	return ok(Json.toJson(listProducts));
    }

}
