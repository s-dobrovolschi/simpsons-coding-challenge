package com.simpsons.corp.api.web.controller;

import com.simpsons.corp.api.model.Phrase;
import com.simpsons.corp.api.model.PhraseDto;
import com.simpsons.corp.api.service.PhraseService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/phrases")
@Slf4j
public class PhraseController {

    private final PhraseService phraseService;
    private final ModelMapper modelMapper;

    public PhraseController (PhraseService phraseService, ModelMapper modelMapper) {
        this.phraseService = phraseService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<PhraseDto> findAllPhrases() {
        List<Phrase> phrases = phraseService.findAllPhrases();

        List<PhraseDto> phraseDtoList = phrases.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        return phraseDtoList;
    }

    private PhraseDto convertToDto(Phrase phrase) {
        return modelMapper.map(phrase, PhraseDto.class);
    }
}
