package constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public First p() {
		First first = new First("srujana", "atlanta");
		first.setId(5);
		return first;

	}

	@Bean
	public Second s() {
		Second second = new Second("sravya", "new jersey");

		return second;
	}

}
