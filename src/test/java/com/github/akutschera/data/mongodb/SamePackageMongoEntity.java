package com.github.akutschera.data.mongodb;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Andreas Kutschera.
 */
@Getter
@Setter
@Document
public class SamePackageMongoEntity {

    @Id
    private String id;

    private String name;

}
