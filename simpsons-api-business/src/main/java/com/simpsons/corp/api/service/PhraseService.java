package com.simpsons.corp.api.service;

import com.simpsons.corp.api.model.Phrase;

import java.util.List;

public interface PhraseService {

    List<Phrase> findAllPhrases();
}
