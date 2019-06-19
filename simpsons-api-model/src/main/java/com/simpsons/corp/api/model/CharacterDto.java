package com.simpsons.corp.api.model;

import lombok.Data;

@Data
public class CharacterDto {

    private String firstName;
    private String lastName;
    private String picture;
    private Integer age;
}
