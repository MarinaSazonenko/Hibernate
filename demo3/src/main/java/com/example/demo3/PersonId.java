package com.example.demo3;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@EqualsAndHashCode // Безопасно для класса-ключа, так как здесь нет связей и ленивой загрузки
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;
}
