package com.github.akutschera.properties.maps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= { MapWithPrefixTest.class, ConfigMapWithPrefix.class } )
@ActiveProfiles("map")
@EnableConfigurationProperties
public class MapWithPrefixTest {

    @Autowired
    private ConfigMapWithPrefix configMap;

    @Test
    public void mapsNamedAfterMapRootAreFilledWithData() throws Exception {
        assertThat( configMap.getOne().get( "foo" ) ).isEqualTo( "baz" );

        assertThat( configMap.getTwo().get( "foo" ) ).isEqualTo( "foobar" );
    }

}
