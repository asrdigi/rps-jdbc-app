package com.wipro.dao;

import java.sql.SQLException;
import java.util.List;

import com.wipro.model.Person;

//CRUD : Create, Read, Update , Delete operations
public interface PersonDAO {
	public abstract String addPerson(Person person) throws SQLException;
	public abstract String updatePerson(Person person) throws SQLException;
	public abstract String deletePerson(Long adharCard ) throws SQLException;
	public abstract Person getPersonById(Long adharCard ) throws SQLException;
	public abstract List<Person> getAllPersons() throws SQLException;
}
