package com.github.akutschera.datajpatest;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Andreas Kutschera.
 */
public interface SamePackageRepository extends JpaRepository<SamePackageEntity,Long> {

}
