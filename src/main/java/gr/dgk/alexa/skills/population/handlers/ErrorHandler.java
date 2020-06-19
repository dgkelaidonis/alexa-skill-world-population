package gr.dgk.alexa.skills.population.handlers;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.exception.AskSdkException;
import com.amazon.ask.model.Response;

public class ErrorHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
	return true;
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
	throw new AskSdkException("An error occurred. Please try again.");
    }

}