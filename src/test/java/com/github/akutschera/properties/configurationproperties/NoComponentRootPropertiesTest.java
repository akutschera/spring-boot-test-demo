package com.github.akutschera.properties.configurationproperties;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Andreas Kutschera.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NoComponentRootProperties.class)
@EnableConfigurationProperties
public class NoComponentRootPropertiesTest {

    @Autowired
    private NoComponentRootProperties fooRoot;

    @Test
    public void fooRootFromApplicationYaml() throws Exception {
        SoftAssertions.assertSoftly( softly -> {
            softly.assertThat( fooRoot.getDefaultValue() ).as("default value").isEqualTo( "only set in root default yml" );
            softly.assertThat( fooRoot.getForProfile() ).as("for-profile").isEqualTo( "is overridden in 'local' profile" );
        });
    }

}
