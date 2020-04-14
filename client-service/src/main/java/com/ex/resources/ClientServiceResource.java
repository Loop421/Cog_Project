package com.ex.resources;

import com.ex.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/clientfe")
public class ClientServiceResource {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/person/{name}")
    public Person getByName(@PathVariable("name") String name){
        Person person = restTemplate.getForObject("http://cog/person/" + name, Person.class);

        return new Person(person.getId(), person.getName(), person.getAge());
    }

    @PostMapping("/addPerson")
    public void save(@RequestBody Person person){
        restTemplate.postForObject("http://cog/person/addPerson", person, Person.class);
    }
}
