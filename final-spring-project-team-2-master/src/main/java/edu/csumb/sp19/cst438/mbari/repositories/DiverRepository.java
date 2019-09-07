package edu.csumb.sp19.cst438.mbari.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.csumb.sp19.cst438.mbari.model.Diver;

@Repository
public interface DiverRepository extends MongoRepository<Diver, String>{
    
}