package com.bellobjects.planets.dao.jpa.config;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import com.bellobjects.planets.dao.jpa.config.AppConfiguration;

@Import({ AppConfiguration.class })
@PropertySource("classpath:/com/bellobjects/planets/dao/jpa/test.properties")
public class TestConfiguration {
    
}
