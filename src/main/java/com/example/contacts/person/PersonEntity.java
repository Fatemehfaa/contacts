package com.example.contacts.person;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonEntity {
    long id;
    String name;
    int age;
    String number;
    String address;

}
