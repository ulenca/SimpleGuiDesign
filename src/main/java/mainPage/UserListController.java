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

@ManagedBean(name="UserListController", eager = true)
@RequestScoped
public class UserListController implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{userList}")
	ArrayList<Users> userList;
	
	UsersDO usersDO = new UsersDO();
	
	public String name, familyName, ligin;
	
	public void setUserList(ArrayList<Users> userList){
		this.userList = userList;
	}
	
	public ArrayList<Users> getUserList() {
		return usersDO.getListOfUsers();
	}
	
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
	
	public ArrayList<Users> getUserList2() {
		System.out.println("odœwie¿am listê...");
		return usersDO.getListOfUsers();
	}
	
}
