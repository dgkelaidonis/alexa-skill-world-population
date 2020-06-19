package gr.dgk.alexa.skills.population.handlers;

import static com.amazon.ask.request.Predicates.requestType;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
	return input.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
	// WRITE THE WELCOME MESSAGE OF YOUR PREFERENCE
	String speechText = "Hello!";
	return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Country Population Info", speechText)
		.build();
    }

}