package com.java2.oo;

public class Drink {

	int id;
	String name;
	int price;
    public Drink(){
    	
    }
	public Drink(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;

	}

	// get跟set的特性是後面設置的第一個字要大寫
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

}
