package com.simpsons.corp.api.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TwittDto {

    private CharacterDto author;
    private String phrase;
    private LocalDateTime timestamp;
}
