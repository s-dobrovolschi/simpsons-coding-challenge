package com.simpsons.corp.api.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
public class Character {

    @Id
    public ObjectId _id;

    private String firstName;
    private String lastName;
    private String picture;
    private Integer age;
}
