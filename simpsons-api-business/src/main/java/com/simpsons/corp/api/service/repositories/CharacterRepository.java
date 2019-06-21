package com.simpsons.corp.api.service.repositories;

import com.simpsons.corp.api.model.Character;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CharacterRepository extends MongoRepository<Character, String> {

    @Query("{_id: ?0} ")
    Optional<Character> findById(String id);

}
