package com.example.demo3;

import com.example.demo3.Person;
import com.example.demo3.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    // Внедряем репозиторий через конструктор
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // Обработка GET-запроса вида /persons/by-city?city=Moscow
    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return personRepository.getPersonsByCity(city);
    }
}
