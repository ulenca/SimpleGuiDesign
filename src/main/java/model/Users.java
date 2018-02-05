package model;

import java.sql.SQLException;
import java.util.ArrayList;
import dao.UsersDO;

public class Users {
	
	public String name;
	public String familyName;
	public String login;
	
	public Users(String name, String familyName, String login){
		this.name = name;
		this.familyName = familyName;
		this.login = login;
		System.out.println("utworzono uzytkownika " + name);
	}
}
