package com.simpsons.corp.api.web.controller;

import com.simpsons.corp.api.model.Character;
import com.simpsons.corp.api.model.CharacterDto;
import com.simpsons.corp.api.service.CharacterService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/characters")
@Slf4j
public class CharacterController {

    private final CharacterService characterService;
    private final ModelMapper modelMapper;

    public CharacterController (CharacterService characterService, ModelMapper modelMapper) {
        this.characterService = characterService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<CharacterDto> findAllCharacters() {
        List<Character> characters = characterService.findAllCharacters();

        List<CharacterDto> productDtoList = characters.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        return productDtoList;
    }

    private CharacterDto convertToDto(Character character) {
        return modelMapper.map(character, CharacterDto.class);
    }

}
