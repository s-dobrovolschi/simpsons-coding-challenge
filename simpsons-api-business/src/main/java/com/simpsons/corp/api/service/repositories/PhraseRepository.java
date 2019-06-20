package com.simpsons.corp.api.service.repositories;

import com.simpsons.corp.api.model.Phrase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhraseRepository extends MongoRepository<Phrase, String> {

}
