package com.ex.cog_interview.controller;

import com.ex.cog_interview.model.Person;
import com.ex.cog_interview.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
@CrossOrigin(origins = "*")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/{name}")
    public Person getByName(@PathVariable("name") String name){
        return personService.findByName(name);
    }

    @PostMapping(value = "/addPerson")
    public void save(@RequestBody Person person){
        personService.save(person);
    }

    @GetMapping("/deletePerson/{name}")
    public void delete(@PathVariable("name") String name)
    {
        personService.deleteByName(name);
    }
}
