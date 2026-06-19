package com.example.demo3;

import com.example.demo3.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository // Помечаем класс как репозиторий
public class PersonRepository {

    @PersistenceContext // Инжектируем EntityManager
    private EntityManager entityManager;

    // Метод возвращает список людей, отфильтрованных по городу
    public List<Person> getPersonsByCity(String city) {
        String jpql = "SELECT p FROM Person p WHERE LOWER(p.cityOfLiving) = LOWER(:city)";
        return entityManager.createQuery(jpql, Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
