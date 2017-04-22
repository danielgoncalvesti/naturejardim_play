package dao;

import javax.persistence.NoResultException;
import models.entities.Users;
import play.Logger;
import play.db.jpa.JPA;


public class UserJpaDaoImpl implements IUserDAO{

	@Override
	public void create(Users u) {
		JPA.em().persist(u);		
	}

	@Override
	public Users login(String login, String password) {
		try {
			Users u = (Users) JPA.em().createQuery("SELECT u FROM "+Users.TABLE+" u WHERE login=:login").setParameter("login", login).getSingleResult();
			
			if (u.getLogin().equals(login) && u.getPassword().equals(password)){
				return u;
			}
			return null;
		} catch(NoResultException nre){
			Logger.info("Usuário e Senha incorretos! Usuário tentado:"+ login );
			return null;
		}

	}

}
