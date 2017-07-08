package com.github.akutschera.data.flyway;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Andreas Kutschera.
 */
public interface FlywayRepository extends JpaRepository<FlywayEntity,Long> {

}
