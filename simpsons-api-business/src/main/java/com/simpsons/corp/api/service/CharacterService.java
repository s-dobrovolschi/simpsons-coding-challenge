package com.simpsons.corp.api.service;

import com.simpsons.corp.api.model.Character;

import java.util.List;
import java.util.Optional;

public interface CharacterService {

    List<Character> findAllCharacters();

    Optional<Character> findById(String id);
}
