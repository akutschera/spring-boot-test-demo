package com.github.akutschera.data.jpatest;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Andreas Kutschera.
 */
public interface SamePackageRepository extends JpaRepository<SamePackageEntity,Long> {

}
