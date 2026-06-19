package com.example.demo3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonId> {

    // Метод 1: Поиск по городу проживания (без учета регистра)
    List<Person> findByCityOfLivingIgnoreCase(String city);

    // Метод 2: Поиск людей моложе указанного возраста с сортировкой по возрастанию
    List<Person> findByAgeLessThanOrderByAgeAsc(int age);

    // Метод 3: Поиск человека по имени и фамилии
    Optional<Person> findByNameAndSurname(String name, String surname);
}
