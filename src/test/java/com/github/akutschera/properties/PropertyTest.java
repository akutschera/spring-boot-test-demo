package com.github.akutschera.properties;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=PropertyTest.class, properties = {
        "prop:4",
        "withEqual=5",
        "withSpaces : 6",
        "config.profile:overridden in test class",
        "overridden.in.test: here you can override external properties"
})
public class PropertyTest {

    @Value( "${prop}" )
    private int withColon;

    @Value( "${withEqual}" )
    private int withEqual;

    @Value( "${withSpaces}" )
    private int withSpaces;

    // unset
    @Value( "${withDefault:2}" )
    private int withDefault;

    // set in pom.xml
    @Value( "${externalProperty}" )
    private int externalProperty;

    @Value( "${config.profile}" )
    private String configProfile;

    @Value( "${overridden.in.test}" )
    private String overriddenInTest;

    @Test
    public void propertyWithColon() throws Exception {
        assertThat( withColon ).isEqualTo( 4 );
    }

    @Test
    public void propertyWithEqualSign() throws Exception {
        assertThat( withEqual ).isEqualTo( 5 );
    }

    @Test
    public void propertyWithSpaces() throws Exception {
        assertThat( withSpaces ).isEqualTo( 6 );
    }

    @Test
    public void propertyWithDefault() throws Exception {
        assertThat( withDefault ).isEqualTo( 2 );
    }

    @Test
    public void externalProperty() throws Exception {
        assertThat( externalProperty ).isEqualTo( 1 );
    }

    @Test
    public void configProfile() throws Exception {
        assertThat( configProfile ).isEqualTo( "overridden in test class" );
    }

    @Test
    public void overriddenInTest() throws Exception {
        assertThat( overriddenInTest ).isEqualTo( "here you can override external properties" );
    }

}
