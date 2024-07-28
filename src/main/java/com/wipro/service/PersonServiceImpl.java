package com.wipro.service;

import java.sql.SQLException;
import java.util.List;

import com.wipro.dao.PersonDAO;
import com.wipro.dao.PersonDaoImpl;
import com.wipro.exception.PersonException;
import com.wipro.model.Person;

public class PersonServiceImpl implements PersonService{
	private PersonDAO personDAO = new PersonDaoImpl();

	@Override
	public String addPerson(Person person) throws PersonException {
		try {
			/*
			 * Before sending the Person object to DAO class method, Validate the person object
			 */
			return personDAO.addPerson(person);
		}catch(SQLException e) {
			throw new PersonException(e.getMessage(),e);
		}
	}

	@Override
	public String updatePerson(Person person) throws PersonException {
		try {

			String message = personDAO.updatePerson(person);
			return message;
		}catch(SQLException e) {
			throw new PersonException(e.getMessage(),e);
		} 
	}

	@Override
	public String deletePerson(Long adharCard) throws PersonException {
		try {

			String message = personDAO.deletePerson(adharCard);
			return message;
		}catch(SQLException e) {
			throw new PersonException(e.getMessage(),e);
		} 
	}

	@Override
	public Person getPersonById(Long adharCard) throws PersonException {
		try {

			Person person = personDAO.getPersonById(adharCard); 
			return person;
		}catch(SQLException e) {
			throw new PersonException(e.getMessage(),e);
		} 
	}
		
	@Override
	public List<Person> getAllPersons() throws PersonException {
		try {

			List<Person> personList = personDAO.getAllPersons();
			//post-processing working
			return personList;
		}catch(SQLException e) {
			throw new PersonException(e.getMessage(),e);
		}
	}

}
