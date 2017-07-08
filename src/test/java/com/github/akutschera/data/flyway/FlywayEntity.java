package com.github.akutschera.data.flyway;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Andreas Kutschera.
 */
@Entity
public class FlywayEntity implements Serializable {
    @Id
    private Long id;

    private String name;
}
