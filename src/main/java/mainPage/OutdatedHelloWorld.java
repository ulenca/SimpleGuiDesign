package mainPage;

import javax.faces.bean.ManagedBean;


@ManagedBean(name = "helloWorld", eager = true)
public class OutdatedHelloWorld {
   public OutdatedHelloWorld() {
      System.out.println("strona startowa test");
   }
	
   public String getMessage() {
      return "Simple GUI Design Project!";
   }
}


