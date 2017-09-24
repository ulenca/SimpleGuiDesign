package mainPage;

import javax.faces.bean.ManagedBean;


@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
   public HelloWorld() {
      System.out.println("strona startowa");
   }
	
   public String getMessage() {
      return "hii!";
   }
}


