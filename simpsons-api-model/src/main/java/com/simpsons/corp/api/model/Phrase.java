package com.simpsons.corp.api.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
public class Phrase {

    @Id
    public ObjectId _id;

    private String character;
    private String phrase;
}
