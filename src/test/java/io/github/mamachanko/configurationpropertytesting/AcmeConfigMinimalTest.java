package io.github.mamachanko.configurationpropertytesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AcmeConfig.class)
@EnableConfigurationProperties(value = AcmeConfig.class)
@TestPropertySource(properties = {
        "acme.name=test-name"
})
public class AcmeConfigMinimalTest {

    @Autowired
    private AcmeConfig acmeConfig;

    @Test
    public void hasName() {
        assertThat(acmeConfig.getName()).isEqualTo("test-name");
    }

    @Test
    public void isNotEnabled() {
        assertThat(acmeConfig.isEnabled()).isFalse();
    }

    @Test
    public void hasNullSecurity() {
        assertThat(acmeConfig.getSecurity()).isNull();
    }
}
