package com.github.akutschera.properties.maps;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Andreas Kutschera.
 */
@Getter
@Setter
@Component
@ConfigurationProperties
public class ConfigMap {

    private Map<String,String> one;

    private Map<String, Map<String,String>> nested;

}
