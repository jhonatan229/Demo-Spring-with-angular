package com.example.demo.api;

import com.example.demo.model.Client;
import com.example.demo.model.Person;
import com.example.demo.service.ClientService;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(@Qualifier("fakeService") PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    public void addPerson(@NonNull @RequestBody Person person){
        personService.addPerson(person);
    }
    @GetMapping
    public List<Person> selectAllPeople(){
        return personService.selectAllPeople();
    }
    @GetMapping (path = "{id}")
    public Person SelectPersonById(@PathVariable("id") UUID id) {
        return personService.SelectPersonById(id)
                .orElse(null);
    }
    @DeleteMapping(path = "{id}")
    public int DeletePersonById(@PathVariable("id") UUID id){
        return personService.deletePersonById(id);
    }
    @PutMapping(path = "{id}")
    public int updatePersonByID(@PathVariable UUID id, @NonNull @RequestBody Person person){
        return personService.updatePersonByID(id, person);
    }
}
