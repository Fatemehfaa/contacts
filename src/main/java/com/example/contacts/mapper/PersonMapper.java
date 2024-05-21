package com.example.contacts.mapper;

import com.example.contacts.dto.PersonDto;
import com.example.contacts.person.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonMapper Instance = Mappers.getMapper(PersonMapper.class);

    PersonDto toDto(PersonEntity personEntity);


}
