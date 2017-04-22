package models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Users {
	
	public static String TABLE = Users.class.getSimpleName();
			
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;
	
	@Column(unique = true)
	private String login;
	
	@Column
	private String password;
	
	public Users() {
	}
	
	public Users(String login, String password){
		this.login = login;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
