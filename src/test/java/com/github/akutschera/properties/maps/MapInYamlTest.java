package com.github.akutschera.properties.maps;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

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
@SpringBootTest(classes = { MapInYamlTest.class, ConfigMap.class })
@ActiveProfiles("map")
@EnableConfigurationProperties
public class MapInYamlTest {

    @Autowired
    private ConfigMap configMap;

    @Test
    public void mapShouldHaveBeenCreated() throws Exception {
        // config Map is filled with some values from application-map.yml
        // only the values for which there are setters defined in the
        // bean are set.
        Map<String, String> propsFromSet = configMap.getOne();
        assertThat( propsFromSet ).isNotNull();
        assertThat( propsFromSet.get( "foo" ) ).isEqualTo( "bar" );
    }

    @Test
    public void nestedConfigInjectMapOfMaps() throws Exception {
        Map<String, Map<String, String>> nested = configMap.getNested();
        assertThat( nested ).isNotNull();
        Map<String, String> one = nested.get( "one" );
        assertThat( one.get( "foo" ) ).isEqualTo( "baz" );
        assertThat( nested.get( "two" ).get( "foo" ) ).isEqualTo( "foobar" );
    }

}
