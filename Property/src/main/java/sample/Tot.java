package sample;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DemConfig.class, Disk2Config.class})
public class Tot {

}
