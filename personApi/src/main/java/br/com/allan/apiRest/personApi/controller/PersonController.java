package br.com.allan.apiRest.personApi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.allan.apiRest.personApi.dto.request.PersonDTO;
import br.com.allan.apiRest.personApi.response.MessageResponseDTO;
import br.com.allan.apiRest.personApi.service.PersonService;


@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

	private PersonService personService;

	@Autowired(required = true)
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
		return personService.createPerson(personDTO);
	}

}
