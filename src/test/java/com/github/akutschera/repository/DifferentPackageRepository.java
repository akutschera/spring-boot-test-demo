package com.github.akutschera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Andreas Kutschera.
 */
public interface DifferentPackageRepository extends JpaRepository<DifferentPackage,Long> {

}
