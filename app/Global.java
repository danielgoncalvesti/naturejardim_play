import play.*;
import play.db.jpa.JPA;

import dao.UserJpaDaoImpl;
import models.entities.*;


public class Global extends GlobalSettings {
	
	UserJpaDaoImpl userDao = new UserJpaDaoImpl();
	
	@Override
    public void onStart(final Application app) {
    	
		JPA.withTransaction(() -> {
			userDao.create(new Users("danielgoncalvesti@gmail.com", "daniel123", "Daniel Goncalves da Silva"));
			Logger.info("The user: danielgoncalvesti@gmail.com was saved successfully!");
			userDao.create(new Users("robson@naturejardim.com.br", "daniel123", "Robson Lazaretti"));
			Logger.info("The user: robson@naturejardim.com.br was saved successfully!");
		});
    
    	System.out.println("--------------------");
    	System.out.println("--------------------");
    	System.out.println("User recorded ");
    	System.out.println("--------------------");
    	System.out.println("--------------------");
    }
}