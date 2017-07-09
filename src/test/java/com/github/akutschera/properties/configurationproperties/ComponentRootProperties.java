package com.github.akutschera.properties.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Andreas Kutschera.
 */

@ConfigurationProperties(prefix = "foo.root")
@Component
@Getter
@Setter
// does not work: @RequiredArgsConstructor
public class ComponentRootProperties {

    private String defaultValue;

    private String forProfile;

}
