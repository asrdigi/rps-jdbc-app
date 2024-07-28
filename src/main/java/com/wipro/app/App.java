package com.wipro.app;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.wipro.exception.PersonException;
import com.wipro.model.GenderTyp;
import com.wipro.model.Person;
import com.wipro.service.PersonService;
import com.wipro.service.PersonServiceImpl;

public class App {
	private static PersonService personService = new PersonServiceImpl();
	private static Scanner scanner = new Scanner(System.in);
	private static Logger logger = Logger.getLogger(App.class);

	public static void main( String[] args ){

		try {
			Person person = new Person(123123123898L,"Manisha",
					GenderTyp.FEMALE,LocalDate.of(1999, 11, 18),"Kanput",7693265700L);

			String message = personService.addPerson(person);
			System.out.println(message);
			logger.info(message);
		}catch(PersonException e) {
			//    		e.printStackTrace();
			logger.error(e.getMessage(), e);
		}


		try {
			List<Person> personList = personService.getAllPersons();
			personList.forEach(System.out::println);
			logger.info("Displaying details all persons..");
		}catch(PersonException e) {
			//    		e.printStackTrace();
			logger.error(e.getMessage(),e);
		}

		while(true) {

			try {
				System.out.println("Enter adharcard: ");
				long adharCard = Long.parseLong(scanner.nextLine());
				Person person = personService.getPersonById(adharCard);
				System.out.println(person);

			}catch(PersonException e) {
				e.printStackTrace();
			}
			
			System.out.println("Press X to stop");
			if(scanner.nextLine().equalsIgnoreCase("X")) break;
		}


		//    	try {
		//    		System.out.println("Enter adharcard of the person to delete: ");
		//    		long adharCard = Long.parseLong(scanner.nextLine());
		//    		String message = personService.deletePerson(adharCard);
		//    		System.out.println(message);
		//    		
		//    	}catch(PersonException e) {
		//    		e.printStackTrace();
		//    	}


		//    	try {
		//    		System.out.println("Enter adharcard of the person to update: ");
		//    		long adharCard = Long.parseLong(scanner.nextLine());
		//    		Person person = personService.getPersonById(adharCard);
		//    		
		//    		System.out.println("Hi, "+ person.getName()+ "Do want to change your name(yes/no)");
		//    		String option = scanner.nextLine();
		//    		if(option.equalsIgnoreCase("yes")) {
		//    			System.out.println("Enter your new name: ");
		//    			person.setName(scanner.nextLine());
		//    		}
		//    		
		//    		System.out.println("Change Gender? (yes/no): ");
		//    		option = scanner.nextLine();
		//    		if(option.equalsIgnoreCase("yes")) {
		//    			System.out.println("Enter Gender ");
		//    			person.setGender( GenderTyp.valueOf(scanner.nextLine()));
		//    		}
		//    		
		//    		
		//    		System.out.println("Change Birthdate? (yes/no): ");
		//    		option = scanner.nextLine();
		//    		if(option.equalsIgnoreCase("yes")) {
		//    			System.out.println("Enter New Birthdate(yyyy-mm-dd) ");
		//    			//String -> LocalDate
		//    			person.setBirthdate(LocalDate.parse(scanner.nextLine()));
		//    		}
		//    		
		//    		
		//    		System.out.println("Change Address? (yes/no): ");
		//    		option = scanner.nextLine();
		//    		if(option.equalsIgnoreCase("yes")) {
		//    			System.out.println("Enter New Address: ");
		//    			//String -> LocalDate
		//    			person.setAddress(scanner.nextLine());
		//    		}
		//    		
		//    		
		//    		System.out.println("Change Mobile? (yes/no): ");
		//    		option = scanner.nextLine();
		//    		if(option.equalsIgnoreCase("yes")) {
		//    			System.out.println("Enter New Mobile N umber: ");
		//    			person.setMobile(Long.parseLong(scanner.nextLine()));
		//    		}
		//    		
		//    		String message = personService.updatePerson(person);
		//    		System.out.println(message);
		//    		
		//    	}catch(PersonException e) {
		//    		e.printStackTrace();
		//    	}

	}
}
