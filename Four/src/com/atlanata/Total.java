package com.atlanata;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DemoConfig.class,DiskConfig.class})
public class Total {

}
