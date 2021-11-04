package br.com.allan.apiRest.personApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.allan.apiRest.personApi.entity.Person;

@Repository
@Component
@EnableJpaRepositories
public interface PersonRepository extends JpaRepository<Person, Long> {	

}
