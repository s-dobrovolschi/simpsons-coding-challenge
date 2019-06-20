package com.simpsons.corp.api.web.controller;

import com.simpsons.corp.api.model.Character;
import com.simpsons.corp.api.model.CharacterDto;
import com.simpsons.corp.api.model.Phrase;
import com.simpsons.corp.api.model.TwittDto;
import com.simpsons.corp.api.service.CharacterService;
import com.simpsons.corp.api.service.PhraseService;
import com.simpsons.corp.api.web.exception.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/twitts")
@Slf4j
public class TwittsController {

    private final PhraseService phraseService;
    private final CharacterService characterService;

    private final ModelMapper modelMapper;

    public TwittsController(PhraseService phraseService, ModelMapper modelMapper, CharacterService characterService){
     this.phraseService = phraseService;
     this.modelMapper = modelMapper;
     this.characterService = characterService;
    }

    @GetMapping
    public List<TwittDto> findAllTwitts() {
        List<Phrase> phrases = phraseService.findAllPhrases();

        List<TwittDto> twittDtoList = phrases.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        return twittDtoList;
    }

    private TwittDto convertToDto(Phrase phrase) {
        TwittDto twittDto = modelMapper.map(phrase, TwittDto.class);
        Character character = characterService.findById(phrase.getCharacter()).orElseThrow(ResourceNotFoundException::new);
        twittDto.setAuthor(modelMapper.map(character, CharacterDto.class));

        //The timestamp should contain the time when the twitt was posted on the server. For demo purposes managed as current timestamp
        twittDto.setTimestamp(LocalDateTime.now());
        return twittDto;
    }

}
