package com.hsj.springboot.servlet;

import com.hsj.springboot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String display(){

        return person.getName()+person.getAge();
    }


}
