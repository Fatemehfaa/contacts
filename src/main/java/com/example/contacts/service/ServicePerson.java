package com.example.contacts.service;

import com.example.contacts.dto.PersonDto;
import com.example.contacts.mapper.PersonMapper;
import com.example.contacts.person.PersonEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServicePerson {

    List<PersonEntity> persons = new ArrayList<>(
            List.of(
                    PersonEntity.builder()
                            .number("123456")
                            .age(1)
                            .address("mirdamad")
                            .name("jadi")
                            .build()
            )
    );


    public PersonDto getPerson(String number) {

        return PersonMapper.Instance.toDto(persons.stream()
                .filter(personEntity -> personEntity.getNumber().equals(number))
                .findAny()
                .orElseGet(() -> PersonEntity.builder()
                        .name("jadi nistam")
                        .build())
        );
    }
}

