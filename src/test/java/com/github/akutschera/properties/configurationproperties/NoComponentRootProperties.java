package com.github.akutschera.properties.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Andreas Kutschera.
 */

@ConfigurationProperties(prefix = "foo.root")
@Getter
@Setter
public class NoComponentRootProperties {

    private String defaultValue;

    private String forProfile;

}
