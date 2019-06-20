package com.simpsons.corp.api.model;

import lombok.Data;

@Data
public class PhraseDto {

    private CharacterDto characterId;
    private String phrase;
}
