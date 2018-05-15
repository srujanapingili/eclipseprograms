package sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Disk2Config {
	@Bean(name="sravya")
	public Disk2 disk2() {
		return new Disk2();
	}

}
