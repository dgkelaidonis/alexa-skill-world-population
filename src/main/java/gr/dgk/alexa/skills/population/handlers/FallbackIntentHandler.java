package gr.dgk.alexa.skills.population.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class FallbackIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
	return input.matches(intentName("AMAZON.FallbackIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
	String speechText = "Sorry, I don't know this. You can try saying \"Help\"!";
	return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Country Population Info", speechText)
		.withReprompt(speechText).build();
    }

}