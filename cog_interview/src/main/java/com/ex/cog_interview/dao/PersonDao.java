package com.ex.cog_interview.dao;

import com.ex.cog_interview.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PersonDao extends CrudRepository<Person, Integer> {

    Person findByName(String name);
    Person deleteByName(String name);
}
