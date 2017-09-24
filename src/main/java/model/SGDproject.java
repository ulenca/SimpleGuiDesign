package model;

public class SGDproject {
	
	String name;
	
	public SGDproject(String name){
		this.name = name;
		System.out.println("Project with name "+ this.name+ "was succesfully created!");
	}
	
	public String getName (){
		return name;
	}

}
