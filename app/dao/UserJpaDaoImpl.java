package dao;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import models.entities.Users;
import play.Logger;
import play.db.jpa.JPA;


public class UserJpaDaoImpl implements IUserDAO{

	@Override
	public void create(Users u) {
		try {
			JPA.em().persist(u);
			Logger.info("The user : "+ u.getLogin() + " was saved successfully!");
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public Users login(String login, String password) {
		try {
			Users u = (Users) JPA.em().createQuery("SELECT u FROM "+Users.TABLE+" u WHERE login=:login").setParameter("login", login).getSingleResult();
			
			if (u.getLogin().equals(login) && u.getPassword().equals(password)){
				return u;
			} else {
				return null;
			}
		} catch(NoResultException nre){
//			Logger.info("Usuário e Senha incorretos! Usuário tentado:"+ login + " senha: "+ password);
			return null;
		}

	}

}
