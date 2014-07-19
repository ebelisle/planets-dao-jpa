package com.bellobjects.planets.dao.jpa;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.bellobjects.planets.dao.PlanetDao;
import com.bellobjects.planets.dao.jpa.config.TestConfiguration;
import com.bellobjects.planets.model.Planet;

@ContextConfiguration(classes={TestConfiguration.class})
public class PlanetDaoJpaTest extends AbstractJUnit4SpringContextTests {
	
    @Autowired(required=true)
    private PlanetDao planetDao;
    
    @Test
	public void CountPlanets() {
	    Collection<Planet> planets = planetDao.getPlanets();
	    
	    Collection<String> planetNames = new HashSet<>();
	    for (Planet planet : planets) {
            planetNames.add(planet.name);
        }
	}
}
