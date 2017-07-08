package com.github.akutschera.data.flyway;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(SpringRunner.class)
@SpringBootTest( properties = {
        "spring.jpa.hibernate.ddl-auto=update"
})
@DataJpaTest( excludeAutoConfiguration = FlywayAutoConfiguration.class)
public class ExcludeFlywayTest {
    @Autowired
    private FlywayRepository flywayRepository;

    @Test
    public void flywayShouldHaveAddedRecord() throws Exception {
        assertThat( flywayRepository.count() ).as("/resources/db/migration/*.sql was executed").isEqualTo( 0L );
    }

    @Configuration
    static class TestConfig {}
}
