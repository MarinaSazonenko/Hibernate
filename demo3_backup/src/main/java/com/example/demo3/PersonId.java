package com.example.demo3;

import java.io.Serializable;
import lombok.Data;

@Data
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;
}
