package com.caresoft.clinicapp;

public class User {

	public User(Integer id){
		this.id = id;

	}
	protected Integer id;
    protected int pin;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
