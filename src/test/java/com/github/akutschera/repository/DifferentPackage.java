package com.github.akutschera.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Andreas Kutschera.
 */
@Entity
public class DifferentPackage {
    @Id
    private Long id;

    private String name;
}
