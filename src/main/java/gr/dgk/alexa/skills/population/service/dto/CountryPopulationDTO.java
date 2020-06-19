package gr.dgk.alexa.skills.population.service.dto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * An indicative structure for Data Transfer Object (DTO), that will be used for
 * transferring data from third-part resource to our skill.
 * 
 * You may use your own structure.
 */
@Component
public class CountryPopulationDTO {
    // Key:Value --> where:Key="ConuntryName" / Value="country population"
    private Map<String, String> countryPopulationMap = new HashMap<String, String>();

    public Map<String, String> getCountryPopulationMap() {
	return countryPopulationMap;
    }

    public void setCountryPopulationMap(Map<String, String> countryPopulationMap) {
	this.countryPopulationMap = countryPopulationMap;
    }

}
