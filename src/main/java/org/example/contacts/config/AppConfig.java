package org.example.contacts.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.contacts")
@PropertySource(value = "classpath:application.properties")
public class AppConfig {
}
