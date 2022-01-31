package com.ilkayaktas.springhibernateexperiment.repository;

import com.ilkayaktas.springhibernateexperiment.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}