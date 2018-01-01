package com.springboot.springboot.Controller;

import com.springboot.springboot.Service.PersonService;
import com.springboot.springboot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chaitanyaprashar on 31/12/2017.
 */
@RestController
@RequestMapping("/all")
public class PersonController {

    @Autowired
    private PersonService personService;

     @RequestMapping("/persons")
     public List<Person> getDetail()
     {
       return personService.getDetail();
     }


}
