package com.simpsons.corp.api.service.impl;

import com.simpsons.corp.api.model.Character;
import com.simpsons.corp.api.service.CharacterService;
import com.simpsons.corp.api.service.repositories.CharacterRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public List<Character> findAllCharacters() {

        return characterRepository.findAll();
    }
}
