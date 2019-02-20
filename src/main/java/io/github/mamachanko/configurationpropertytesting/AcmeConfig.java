package io.github.mamachanko.configurationpropertytesting;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Component
@ConfigurationProperties(prefix = "acme")
@Data
@Validated
public class AcmeConfig {

    @NotBlank
    private String name;

    private boolean enabled;

    private AcmeSecurity security;
}
