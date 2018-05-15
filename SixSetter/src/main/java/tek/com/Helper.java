package tek.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Helper {
	Independent i;

	@Bean(name = "srujana")
	public Independent get() {
	
		return new Independent();
	}
	

}
