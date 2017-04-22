package controllers;

import dao.IUserDAO;
import dao.UserJpaDaoImpl;
import models.entities.Users;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class UserCRUD extends Controller {

	static IUserDAO userDao = new UserJpaDaoImpl();
	
	@Transactional
	public Result doLogin(String login, String password){
		
		Users userLogin = userDao.login(login.toLowerCase(), password);
	
    	if (userLogin != null){
    		return ok(Json.toJson(userLogin));	
    	} else {
    		return forbidden();
    	}
    }
	
	
}
