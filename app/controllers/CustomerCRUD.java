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
	    Customer customer = Json.fromJson(json, Customer.class);

		customerDao.create(customer);
		return ok();
	}
	
	@Transactional
    @BodyParser.Of(BodyParser.Json.class)	
	public Result updateJson(){
		JsonNode json = request().body().asJson();
		Customer customer = Json.fromJson(json, Customer.class);
		customerDao.update(customer);
		return ok();
	}
	
	@Transactional
	public Result deleteJson(Long id){
		customerDao.delete(id);
		return ok();
	}
	
    @Transactional
    public Result customerById(Long id){
        Customer c = customerDao.find(id);
        if (c == null){
        	return badRequest(Json.toJson("Não existe"));
        }
        return ok(Json.toJson(c));
    }

}
