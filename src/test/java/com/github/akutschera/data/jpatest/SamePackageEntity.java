package com.github.akutschera.data.jpatest;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Andreas Kutschera.
 */
@Entity
public class SamePackageEntity {

    @Id
    private Long id;

    private String name;
}
