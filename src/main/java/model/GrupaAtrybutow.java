package model;

import java.util.ArrayList;

public class GrupaAtrybutow {
	
	public GrupaAtrybutow(String name){
		this.name = name;
		System.out.println("utworzono grup� atrybut�w " + name);
	}
	
	private String name;
	private ArrayList<Atrybut> listaAtr = new ArrayList<Atrybut>();

}
