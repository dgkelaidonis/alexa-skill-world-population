package gr.dgk.alexa.skills.population.handlers;

import java.util.Optional;

import com.amazon.ask.dispatcher.exception.ExceptionHandler;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.exception.AskSdkException;
import com.amazon.ask.model.Response;

public class SkillExceptionHandler implements ExceptionHandler {

    @Override
    public boolean canHandle(HandlerInput input, Throwable throwable) {
	return throwable instanceof AskSdkException;
    }

    @Override
    public Optional<Response> handle(HandlerInput input, Throwable e) {
	// WRITE YOUR BUSINESS LOGIC HERE FOR DETAILED EXCEPTION HANDLING
	String speechText = "An error occurred. Please try again.";
	return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Country Population Info", speechText)
		.build();
    }

}