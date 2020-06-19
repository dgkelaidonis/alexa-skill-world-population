package gr.dgk.alexa.skills.population.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class CountryPopulationIntentHandler implements RequestHandler {
    private final String intentName = "CountryPopulationIntent";

    @Override
    public boolean canHandle(HandlerInput input) {
	return input.matches(intentName(intentName));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

	// -1- Fetch the Data from the defined Rest Controller @'/population_data'

	// -2- Process the fetched data (if it is required)

	// -3- Send back Alexa's speech response to utterance that trigger this intent
	String speechText = "The population of <$country_name> is '<$country_population>'.";
	return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Country Population Info", speechText)
		.build();
    }

}