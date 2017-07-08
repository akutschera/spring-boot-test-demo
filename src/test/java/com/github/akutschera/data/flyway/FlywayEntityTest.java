package com.github.akutschera.data.flyway;

/**
 * Created by Andreas Kutschera.
 */

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest( properties = {
        "spring.jpa.hibernate.ddl-auto=none"
})
@DataJpaTest
@ImportAutoConfiguration(FlywayAutoConfiguration.class)
public class FlywayEntityTest {

    @Autowired
    private FlywayRepository flywayRepository;

    @Test
    public void flywayShouldHaveAddedRecord() throws Exception {
        assertThat( flywayRepository.count() ).as("/resources/db/migration/*.sql was not executed").isEqualTo( 1L );
    }

    @Configuration
    static class TestConfig {}

}
