package gr.dgk.alexa.skills.population.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class HelpIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
	return input.matches(intentName("AMAZON.HelpIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
	// ADD A MEANINGFUL HELP MESSAGE
	String speechText = "You can ask information about the population of the countries across the world! Just say, what is the populations of \"this country\"?";

	// ADD MORE DETAILS ON A CARD MESSAGE THAT WILL BE SHOWN ON AMAZON ECO DEVICES
	// WITH SCREENS AND ON ALEXA APPLICATION DEVICES
	String cardText = "Help message with more details (e.g. more conversation intents).";

	return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Country Population Info", cardText)
		.build();
    }

}