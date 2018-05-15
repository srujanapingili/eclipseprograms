package sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemConfig {
	@Bean(name="srujana")
	public Demo2 demo2() {
		return new Demo2();
	}

}
