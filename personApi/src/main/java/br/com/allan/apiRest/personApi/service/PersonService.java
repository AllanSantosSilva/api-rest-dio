package br.com.allan.apiRest.personApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.allan.apiRest.personApi.dto.request.PersonDTO;
import br.com.allan.apiRest.personApi.entity.Person;
import br.com.allan.apiRest.personApi.mapper.PersonMapper;
import br.com.allan.apiRest.personApi.repository.PersonRepository;
import br.com.allan.apiRest.personApi.response.MessageResponseDTO;

@Service
public class PersonService {

	private PersonRepository personRepository;	
	
	private PersonMapper personMapper;	

	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public MessageResponseDTO createPerson(PersonDTO personDTO) {

		Person personToSave = personMapper.toModel(personDTO);

		Person savedPerson = personRepository.save(personToSave);
		return MessageResponseDTO.builder().message("Created Person with ID " + savedPerson.getId()).build();

	}
}
