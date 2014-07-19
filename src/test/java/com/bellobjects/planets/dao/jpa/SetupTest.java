package com.bellobjects.planets.dao.jpa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.bellobjects.planets.dao.jpa.config.TestConfiguration;

@ContextConfiguration(classes={TestConfiguration.class})
public class SetupTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	private @Value("${planet.home}") String homePlanet;
	
	@Test
	public void PropertyPlaceholderTest() {
		assertEquals(homePlanet, "earth");
	}
}
