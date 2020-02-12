package top.theprimone.springbootpractice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import top.theprimone.springbootpractice.bean.Message;
import top.theprimone.springbootpractice.bean.Person;

@RestController
@RequestMapping("/persons")
public class PersonsController {

  private static List<Person> persons = new ArrayList<>();
  
  static {
    Person aa = new Person();
    aa.setId(1);
    aa.setName("AA");
    aa.setUsername("AA");
    persons.add(aa);

    Person bb = new Person();
    bb.setId(2);
    bb.setName("BB");
    bb.setUsername("BB");
    persons.add(bb);
  }

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<Object> getPersons() {
    return new ResponseEntity<>(persons, HttpStatus.OK);
  }

  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<Object> createPerson(@RequestBody Person person) {
    person.setId(persons.size() + 1);
    persons.add(person);
    return new ResponseEntity<>(person, HttpStatus.CREATED);
  }

  @RequestMapping(value = "/{name}", method = RequestMethod.GET)
  public ResponseEntity<Object> getPersonByName(@PathVariable("name") String name) {
    List<Person> result = persons.stream().filter((Person person) -> person.getName().equals(name)).collect(Collectors.toList());
    return new ResponseEntity<>(!result.isEmpty() ? result : new Message("Not found", "No reference"), HttpStatus.OK);
  }

}
