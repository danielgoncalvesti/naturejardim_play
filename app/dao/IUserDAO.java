package dao;

import models.entities.Users;

public interface IUserDAO {
	void create(Users u);
	Users login(String name, String password);
	

}
