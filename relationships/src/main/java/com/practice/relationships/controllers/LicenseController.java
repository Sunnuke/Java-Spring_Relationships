package com.practice.relationships.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.relationships.models.License;
import com.practice.relationships.models.Person;
import com.practice.relationships.services.LicenseService;
import com.practice.relationships.services.PersonService;

@Controller
public class LicenseController {
	@Autowired
	private LicenseService licenseService;
	@Autowired
	private PersonService personService;
	
	// New License
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("person") License license, Model model) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
	return "/newPer.jsp";
	}
	
	// Create Person
	@RequestMapping(value = "/License", method = RequestMethod.POST)
	public String newLicense(@ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/license/new";
		} else {
			License lic = licenseService.createLicense(license);
			Long id = lic.getPerson().getId();
			return "redirect:/persons/" + id;
		}	
	}
}
