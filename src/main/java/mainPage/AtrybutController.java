package mainPage;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import model.GrupaAtrybutow;

@ManagedBean(name="AtrybutController", eager = true)
@RequestScoped
public class AtrybutController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{name}")
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void createNewAttributeGroup(){
		
		GrupaAtrybutow grupa = new GrupaAtrybutow(name);
		
	}

}
