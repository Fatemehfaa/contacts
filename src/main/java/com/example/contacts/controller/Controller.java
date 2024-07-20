package com.example.contacts.controller;

import com.example.contacts.dto.PersonDto;
import com.example.contacts.person.PersonEntity;
import com.example.contacts.service.ServicePerson;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final ServicePerson servicePerson;

    @GetMapping("/getPerson/{number}")
    public PersonDto getPerson(@PathVariable String number) {
        return servicePerson.getPerson(number);
    }

}
