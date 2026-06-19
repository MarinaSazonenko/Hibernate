package com.example.demo3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonRepository personRepository;

    // Внедряем репозиторий через конструктор
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // 1. URL: /persons/by-city?city=Moscow
    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personRepository.findByCityOfLivingIgnoreCase(city);
    }

    // 2. URL: /persons/by-age-less?age=25
    @GetMapping("/by-age-less")
    public List<Person> getPersonsByAgeLessThan(@RequestParam int age) {
        return personRepository.findByAgeLessThanOrderByAgeAsc(age);
    }

    // 3. URL: /persons/by-name-surname?name=Ivan&surname=Ivanov
    @GetMapping("/by-name-surname")
    public ResponseEntity<Person> getPersonByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return personRepository.findByNameAndSurname(name, surname)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
