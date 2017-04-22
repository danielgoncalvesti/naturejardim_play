package dao;

import models.entities.User;

public interface IUserDAO {
	void create(User u);
	User login(String name, String password);
	

}
