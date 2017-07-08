package com.github.akutschera.datajpatest;

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
