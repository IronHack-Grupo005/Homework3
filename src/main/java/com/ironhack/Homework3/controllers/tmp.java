package com.ironhack.Homework3.controllers;

import com.ironhack.Homework3.classes.Leads;
import com.ironhack.Homework3.repositories.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class tmp {

    @Autowired
    LeadRepository leadRepository;


    @RequestMapping (value = "/la/ruta", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void algo(@PathVariable Long id){

    }

    @RequestMapping (value = "/la/ruta2", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void algo2(@RequestBody Leads lead){

    }
    @RequestMapping (value = "/la/ruta3", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void algo3(@RequestParam(required = false) String uno, @RequestParam Optional<String> dos){

        if(!uno.isEmpty() && dos.isPresent()){

        }
    }
}
