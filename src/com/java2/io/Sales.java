package com.java2.io;

public class Sales {
int type;
int amount;
public Sales(int type, int amount) {
	super();
	this.amount=amount;
	this.type=type;
}
public int getType(){
	return type;
}
public void setType(int type){
	this.type=type;
}
public int getAmount() {
	return amount;
}
public void setAmount(){
	this.amount=amount;
}
}
