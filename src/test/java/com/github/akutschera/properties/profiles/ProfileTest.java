package com.github.akutschera.properties.profiles;

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
@SpringBootTest(classes = ProfileTest.class)
@ActiveProfiles({"local"})
public class ProfileTest {
    
    @Value( "${config.profile}" )
    private String configProfile;

    @Value( "${config.default}" )
    private String configDefault;

    @Value("${root.profile}")
    private String rootProfile;

    @Value( "${root.default}" )
    private String rootDefault;

    @Value( "${main.default}" )
    private String mainDefault;

    @Test
    public void configProfile() throws Exception {
        assertThat( configProfile ).isEqualTo( "set in config with profile" );
    }

    @Test
    public void configDefault() throws Exception {
        assertThat( configDefault ).isEqualTo( "set in config with default profile" );
    }
    @Test
    public void rootProfile() throws Exception {
        assertThat( rootProfile ).isEqualTo( "set in root with profile" );
    }

    @Test
    public void rootDefault() throws Exception {
        assertThat( rootDefault ).isEqualTo( "set in root with default profile" );
    }

    @Test
    public void mainDefault() throws Exception {
        assertThat( mainDefault ).as("is not taken from main if file exists in test").isEqualTo( "${main.default}" );
    }


}
