package com.wipro.service;


import java.util.List;

import com.wipro.exception.PersonException;
import com.wipro.model.Person;

public interface PersonService {
	public abstract String addPerson(Person person) throws PersonException;
	public abstract String updatePerson(Person person) throws PersonException;
	public abstract String deletePerson(Long adharCard ) throws PersonException;
	public abstract Person getPersonById(Long adharCard ) throws PersonException;
	public abstract List<Person> getAllPersons() throws PersonException;
}
