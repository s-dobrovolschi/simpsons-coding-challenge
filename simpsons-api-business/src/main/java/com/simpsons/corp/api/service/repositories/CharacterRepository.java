package com.simpsons.corp.api.service.repositories;

import com.simpsons.corp.api.model.Character;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends MongoRepository<Character, String> {

}
