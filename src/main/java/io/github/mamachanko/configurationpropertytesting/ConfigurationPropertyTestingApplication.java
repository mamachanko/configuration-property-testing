package io.github.mamachanko.configurationpropertytesting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@EnableConfigurationProperties(value = Config.class)
public class ConfigurationPropertyTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationPropertyTestingApplication.class, args);
	}

}

@Component
@Slf4j
class ConfigLogger implements CommandLineRunner {

	private final AcmeConfig acmeConfig;

	ConfigLogger(AcmeConfig acmeConfig) {
		this.acmeConfig = acmeConfig;
	}

	@Override
	public void run(String... args) {
		log.info(acmeConfig.toString());
	}
}
