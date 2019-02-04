package com.alstol.controller;

import java.util.ArrayList;
import java.util.List;
import com.alstol.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/getPersons")
    public ResponseEntity<List<Person>> getPersons() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Alin", 24));
        return ResponseEntity.ok(persons);
    }
}   