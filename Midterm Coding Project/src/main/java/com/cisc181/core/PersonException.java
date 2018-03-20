package com.cisc181.core;

public class PersonException extends Exception{
	private Person person;
	
	public PersonException(Person p, String a) {
		super(a);
		this.person = p;
	}
	
	public Person getP() {
		return person;
	}
}
