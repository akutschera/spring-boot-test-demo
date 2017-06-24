package com.github.akutschera.properties.profiles;

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
@SpringBootTest(classes = MultipleProfilesTest.class)
@ActiveProfiles({ "local", "multiple" })
public class MultipleProfilesTest {

    @Value("${config.profile}")
    private String configProfile;

    @Value("${root.default}")
    private String rootDefault;

    @Test
    public void configProfile() throws Exception {
        assertThat( configProfile ).as("last one in list wins").isEqualTo( "set in config with multiple profile" );
    }

    @Test
    public void rootDefault() throws Exception {
        assertThat( rootDefault ).isEqualTo( "set in root with default profile" );
    }

}
