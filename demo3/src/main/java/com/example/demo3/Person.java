package com.example.demo3;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "PERSONS")
@IdClass(PersonId.class)
public class Person {

    @Id
    @Column(length = 50)
    private String name;

    @Id
    @Column(length = 50)
    private String surname;

    @Id
    private int age;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "city_of_living", length = 100)
    private String cityOfLiving;
}
