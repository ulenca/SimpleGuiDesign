package mainPage;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import model.SGDproject;

@ManagedBean(name = "SGDprojectController", eager = true)
@SessionScoped
public class SGDprojectController implements Serializable{
	
	//String name = "pr56566";
	
	@ManagedProperty(value = "#{name}")
	public String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void newProject(){
		
		SGDproject project = new SGDproject(name);
		System.out.println("nazwa="+ project.getName());
	}
	
	
}