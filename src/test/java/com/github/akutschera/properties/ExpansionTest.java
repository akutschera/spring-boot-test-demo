package com.github.akutschera.properties;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=ExpansionTest.class)
@ActiveProfiles("maven-expansion")
public class ExpansionTest {

    @Value("${property.set.in.pom}")
    private String propertyFromMaven;

    @Test
    public void mavenPropertyIsExpandedWithoutTheNeedForSurefireConfiguration() throws Exception {
        assertThat( propertyFromMaven ).as("you need to filter test resources for this to work").isEqualTo( "For ExpansionTest" );
    }

}
