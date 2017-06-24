package com.github.akutschera.properties.yml;

/**
 * Created by Andreas Kutschera.
 */

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ApplicationYamlTest.class )
@ActiveProfiles("local")
public class ApplicationYamlTest {

    @Value( "${foo.bar}" )
    private String fooBar;

    @Value( "${foo.root.default}" )
    private String fooRootDefault;

    @Value( "${foo.root.for-profile}" )
    private String fooRootForProfile;

    @Value( "${config.profile}" )
    private String configProfile;

    @Test
    public void fooBar() throws Exception {
        assertThat( fooBar ).isEqualTo( "is set in config" );
    }

    @Test
    public void fooRootDefault() throws Exception {
        assertThat( fooRootDefault ).isEqualTo( "only set in root default" );
    }

    @Test
    public void forProfile() throws Exception {
        assertThat( fooRootForProfile ).isEqualTo( "set in local profile" );
    }

    @Test
    public void configProfile() throws Exception {
        assertThat( configProfile ).as( "yml declarations are overridden in .property files" )
                                   .isEqualTo( "set in config with profile" );
    }

}
