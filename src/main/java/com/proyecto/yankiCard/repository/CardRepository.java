package com.proyecto.yankiCard.repository;

import com.proyecto.yankiCard.domain.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card,String> {
}
