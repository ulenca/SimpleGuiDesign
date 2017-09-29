package mainPage;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import model.SGDproject;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class OutdatedNavigationController implements Serializable{
	
	@ManagedProperty(value = "#{param.pageId}")
	private String pageId ="Home";
	
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	

public String showPageTest() {
   
       return "Home";
    
 }

public void test(){
	System.out.println("test sie udal");
}
	
	public String openPage1() {
      return "Page1";
   }


public String showPage() {
	
    if(pageId == null) {
       return "Home";
    }
    
    if(pageId.equals("1")) {
       return "Page1";
    }else if(pageId.equals("2")) {
       return "Page2";
    }else {
       return "Home";
    }
 }
}
