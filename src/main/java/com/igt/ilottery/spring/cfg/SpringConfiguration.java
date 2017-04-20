package com.igt.ilottery.spring.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Spring configuration.
 *
 * @author Francesco Maria Maglia, Ringmaster, f.maglia@ringmaster.it
 */
@Configuration
@ComponentScan(basePackages = "com.igt.ilottery")
public class SpringConfiguration extends WebMvcConfigurationSupport {
}
