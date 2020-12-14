package com.practice.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.relationships.models.License;
import com.practice.relationships.models.Person;
import com.practice.relationships.services.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	// New Person
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
	return "/newPre.jsp";
	}
		
	// Create Person
	@RequestMapping(value = "/Person", method = RequestMethod.POST)
	public String newPerson(@Valid @ModelAttribute("song") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/persons/new";
		} else {
			personService.createPerson(person);
			return "redirect:/licenses/new";
		}	
	}
	
	// Selected Song
	@RequestMapping("/persons/{id}")
	public String profile(@PathVariable("id") Long id, Model model) {
		Person person = personService.findPerson(id);
		License license = person.getLicense();
		model.addAttribute("person", person);
		model.addAttribute("license", license);
		return "/profile.jsp";
	}
}
