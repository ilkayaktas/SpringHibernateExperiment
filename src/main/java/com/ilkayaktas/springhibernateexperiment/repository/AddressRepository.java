package com.ilkayaktas.springhibernateexperiment.repository;

import com.ilkayaktas.springhibernateexperiment.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}