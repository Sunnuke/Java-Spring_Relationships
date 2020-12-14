package com.practice.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.relationships.models.Person;
import com.practice.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
//	RETRIEVE
	public List<Person> allPersons(){
		return personRepository.findAll();
	}
	
	
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if (optionalPerson.isPresent()) {
			return optionalPerson.get();
		}
		else {
			return null;
		}

	}
	
//	CREATE
	public Person createPerson(Person person) {
		System.out.println("Id:"+person.getId());
		return personRepository.save(person);
		
	}

	
}
