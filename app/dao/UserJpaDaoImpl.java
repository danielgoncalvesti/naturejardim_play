package dao;

import models.entities.User;
import play.db.jpa.JPA;


public class UserJpaDaoImpl implements IUserDAO{

	@Override
	public void create(User u) {
		JPA.em().persist(u);		
	}

	@Override
	public User login(String login, String password) {
		User u = new User();
		u = (User) JPA.em().createQuery("SELECT u FROM User u WHERE login=:login").setParameter("login", login).getSingleResult();
		System.out.println("u.getLogin(): "+ u.getLogin());
		System.out.println("u.getPass(): "+ u.getPassword());
		if (u.getLogin().equals(login) && u.getPassword().equals(password)){
			return u;
		}else {
			return null;
		}
		
	}

}
