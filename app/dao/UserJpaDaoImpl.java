package dao;

import models.entities.Users;
import play.db.jpa.JPA;


public class UserJpaDaoImpl implements IUserDAO{

	@Override
	public void create(Users u) {
		JPA.em().persist(u);		
	}

	@Override
	public Users login(String login, String password) {
		Users u = new Users();
		u = (Users) JPA.em().createQuery("SELECT u FROM "+Users.TABLE+" u WHERE login=:login").setParameter("login", login).getSingleResult();
		System.out.println("u.getLogin(): "+ u.getLogin());
		System.out.println("u.getPass(): "+ u.getPassword());
		if (u.getLogin().equals(login) && u.getPassword().equals(password)){
			return u;
		}else {
			return null;
		}
		
	}

}
