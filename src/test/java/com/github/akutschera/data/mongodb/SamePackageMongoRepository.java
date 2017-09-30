package com.github.akutschera.data.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Andreas Kutschera.
 */
public interface SamePackageMongoRepository extends MongoRepository<SamePackageMongoEntity, String> {

}
