package com.wipro.dao;
/*
 * An interface can contain public static final varaibles
 */
public interface QueryMapper {
	public static final String ADD_PERSON = "insert into person values(?,?,?,?,?,?)";
	public static final String GET_PERSON_BY_ID = "select * from person where adhar_card=?";
	public static final String GET_ALL_PERSONS = "select * from person";
	public static final String DELETE_PERSON = "delete from person where adhar_card=?";
	public static final String UPDATE_PERSON = "update person set name=?,gender=?,birthdate=?,address=?,mobile=? where adhar_card=?";
	
}
