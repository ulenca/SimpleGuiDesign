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
		System.out.println("utworzono uzytkownika " + name);
		UsersDO gr = new UsersDO(name, familyName, login);
		
		try {
			gr.saveAttributeGroup();
		} catch (SQLException e) {
			System.out.println("problem z zapisem do bazy");
			e.printStackTrace();
		}
	}

}
