package com.ex.cog_interview.service;

import com.ex.cog_interview.dao.PersonDao;
import com.ex.cog_interview.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    public Person findByName(String name){
        return personDao.findByName(name);
    }

    public void save(Person person){
        personDao.save(person);
    }

    public void deleteByName(String name) {
        personDao.deleteByName(name);
    }
}
