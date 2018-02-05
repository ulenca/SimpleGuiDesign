package dao;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Users;

public class UsersDO implements Serializable{

	private static final long serialVersionUID = -2781734737939565442L;
	private int id;
    private String name;   
    private String familyName;
    private String login;
    private static String db_table = "users";
    
    public UsersDO(String name, String familyName, String login){
        super();
        this.setName(name);
        this.setFamilyName(familyName);
        this.setLogin(login);
        System.out.println("Utworzono obiekt DO");
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public String getLogin() {
		return name;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public void saveAttributeGroup() throws SQLException{
		
		 PreparedStatement preState = null;
		 DatabaseConnectionManager dbm;
		 
		try {
			dbm = new DatabaseConnectionManager();

		
	        try {
	        	System.out.println("Insert rekordu z uzytkownikiem");
	            String sql = "insert into "+db_table+" (name, family_name, login) value (?,?,?)";
	            preState   = dbm.initConnection().prepareStatement(sql); 
	            preState.setString(1, name);
	            preState.setString(2, familyName);
	            preState.setString(3, login);
	            preState.executeUpdate();
	            dbm.connection.commit();
	     
	        } catch (Exception e){
	        	e.printStackTrace();
	        }finally{
	        	if( preState != null )
	                preState.close();
	                dbm.closeConnection();    
	        }
	        
		} catch (Exception e1) {
			System.out.println("b³¹d po³¹czenia do bazy");
			e1.printStackTrace();
		}
	}
	
	
	public List<Users> getListOfUsers () throws SQLException {
		List<Users> list = new ArrayList<Users>();
		
		 PreparedStatement preState = null;
		 DatabaseConnectionManager dbm;
		 ResultSet resultSet        = null;
		 
		 
		try {
			dbm = new DatabaseConnectionManager();

		
	        try {
	        	System.out.println("Pobieram uzytkownikow");
	            String sql = "select * from "+db_table;
	            preState   = dbm.initConnection().prepareStatement(sql); 
	            resultSet  = preState.executeQuery();
	            
	            while (resultSet.next()) {
	                list.add( new Users(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)) );                
	            }
	            
	        } catch (Exception e){
	        	e.printStackTrace();
	        }finally{
	        	if( preState != null )
	                preState.close();
	                dbm.closeConnection();    
	        }
	        
		} catch (Exception e1) {
			System.out.println("b³¹d po³¹czenia do bazy");
			e1.printStackTrace();
		}
		
		return list;
		
	}
	
}
