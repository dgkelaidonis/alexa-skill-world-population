package gr.dgk.alexa.skills.population.service.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gr.dgk.alexa.skills.population.service.dto.CountryPopulationDTO;

/**
 * This controller will deploy and manage the spring boot microservice, as well
 * as it will include its business logic with respect to data delivery to the
 * incoming HTTP requests.
 * 
 * The REST controller listens @'/population_data', for HTTP-GET requests and it
 * returns as response JSON data.
 */
@RestController
public class PopulationDatasetController {

    @RequestMapping(value = "/population_data", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CountryPopulationDTO> fetchAllCountries() {
	// .. ADD YOUR BUSINESS LOGIC HERE FOR FETCHING DATA FROM THIRD-PARTY RESOURCE
	return null;
    }

}
