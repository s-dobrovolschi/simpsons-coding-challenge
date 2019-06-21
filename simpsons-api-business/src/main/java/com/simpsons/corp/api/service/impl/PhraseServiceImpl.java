package com.simpsons.corp.api.service.impl;

import com.simpsons.corp.api.model.Phrase;
import com.simpsons.corp.api.service.PhraseService;
import com.simpsons.corp.api.service.repositories.PhraseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PhraseServiceImpl implements PhraseService {

    private final PhraseRepository phraseRepository;

    public PhraseServiceImpl(PhraseRepository phraseRepository) {
        this.phraseRepository = phraseRepository;
    }


    @Override
    public List<Phrase> findAllPhrases() {
        return phraseRepository.findAll();
    }
}
