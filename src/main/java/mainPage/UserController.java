package mainPage;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import dao.UsersDO;
import model.Users;

@ManagedBean(name="UserController", eager = true)
@RequestScoped
public class UserController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{name}")
	private String name;
	
	@ManagedProperty(value = "#{familyName}")
	private String familyName;
	
	@ManagedProperty(value = "#{login}")
	private String login;
	
	@ManagedProperty(value = "#{userList}")
	ArrayList<Users> userList;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public String getFamilyName(){
		return familyName;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin(){
		return login;
	}
	
	public void setUserList(ArrayList<Users> userList){
		this.userList = userList;
	}
	
	public ArrayList<Users> getUserList() {
		return UsersDO.getListOfUsers();
	}

	
	public void createUser(){
		
		Users user = new Users(name, familyName, login);
		UsersDO userDo = new UsersDO(user);
			
			try {
				userDo.saveUser();
			} catch (SQLException e) {
				System.out.println("problem z zapisem do bazy");
				e.printStackTrace();
			}
		}
		
}
