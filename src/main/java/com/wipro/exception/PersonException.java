package com.wipro.exception;
//custom checked exception
public class PersonException extends Exception{

	public PersonException() {
		super("Person Exception Thrown");
	}
	
	public PersonException(String message) {
		super(message);
	}
	
	public PersonException(String message, Throwable t) {
		super(message,t);
	}
}
