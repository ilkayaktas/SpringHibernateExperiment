package com.ilkayaktas.springhibernateexperiment.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by ilkayaktas on 29.01.2022 at 17:26.
 */
@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

}
