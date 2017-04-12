package controllers;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import dao.CustomerJpaDaoImpl;
import dao.ICustomerDAO;
import models.entities.Customer;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Http.RequestBody;
import play.mvc.Result;

public class CustomerCRUD extends Controller{
	
	static ICustomerDAO customerDao = new CustomerJpaDaoImpl();
	
	@Transactional(readOnly=true)
	public Result index(){
    	List<Customer> listCustomer = customerDao.findAll();
    	return ok(Json.toJson(listCustomer));		
	}
	
	@Transactional
    @BodyParser.Of(BodyParser.Json.class)
	public Result addJson(){
		JsonNode json = request().body().asJson();
		String name = json.findPath("name").textValue();
		Logger.info("name: "+ name);
		
		Customer customer = new Customer(name);
		customerDao.create(customer);
		
		return ok();
	}

}
