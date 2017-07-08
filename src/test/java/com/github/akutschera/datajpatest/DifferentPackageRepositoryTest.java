package com.github.akutschera.datajpatest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.akutschera.repository.DifferentPackage;
import com.github.akutschera.repository.DifferentPackageRepository;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class DifferentPackageRepositoryTest {

    @Autowired
    private DifferentPackageRepository differentPackageRepository;

    @Test
    public void repositoryShouldHaveBeenInitialized() throws Exception {
        assertThat( differentPackageRepository.count() ).isEqualTo( 0L );
    }

    @Configuration
    @EnableJpaRepositories(basePackageClasses = DifferentPackageRepository.class)
    @EntityScan(basePackageClasses = { DifferentPackage.class })
    static class SpringFindsThisOne {}
}
