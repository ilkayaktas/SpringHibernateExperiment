package com.ilkayaktas.springhibernateexperiment;

import com.ilkayaktas.springhibernateexperiment.model.Address;
import com.ilkayaktas.springhibernateexperiment.model.Person;
import com.ilkayaktas.springhibernateexperiment.repository.AddressRepository;
import com.ilkayaktas.springhibernateexperiment.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHibernateExperimentApplication {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateExperimentApplication.class, args);
    }

    @Bean
    public CommandLineRunner CommandLineRunnerBean() {
        return (args) -> {
            Iterable<Person> all = personRepository.findAll();

            all.forEach(person -> {
                System.out.println(person.getId()+" "+person.getName()+" "+person.getAllAddresses().size());
            });

            Iterable<Address> all1 = addressRepository.findAll();
            all1.forEach(address -> {
                System.out.println(address.getId()+" "+address.getAddress()+" "+address.getPerson().getName());
            });
        };
    }
}
