package gr.dgk.alexa.skills.population.service;

import javax.servlet.annotation.WebServlet;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.servlet.SkillServlet;

import gr.dgk.alexa.skills.population.handlers.CancelandStopIntentHandler;
import gr.dgk.alexa.skills.population.handlers.CountryPopulationIntentHandler;
import gr.dgk.alexa.skills.population.handlers.ErrorHandler;
import gr.dgk.alexa.skills.population.handlers.FallbackIntentHandler;
import gr.dgk.alexa.skills.population.handlers.HelpIntentHandler;
import gr.dgk.alexa.skills.population.handlers.LaunchRequestHandler;
import gr.dgk.alexa.skills.population.handlers.SessionEndedRequestHandler;
import gr.dgk.alexa.skills.population.handlers.SkillExceptionHandler;

/**
 * Defines the Servlet that implements the custom Alexa skill as web service.
 * The extended class 'SkillServlet ', provides the specifications of the
 * servlet capabilities, according the Amazon ASK SDK design.
 */
@WebServlet(urlPatterns = "/alexa_custom_skill")
public class AlexaSkillServlet extends SkillServlet {

    public AlexaSkillServlet() {
	super(countryPopulationSkill());
    }

    private static Skill countryPopulationSkill() {
	/* build and return the skill Servlet handler for dispatching skill requests */
	return Skills.standard()
		.addRequestHandlers(new LaunchRequestHandler(), new HelpIntentHandler(),
			new CountryPopulationIntentHandler(), new CancelandStopIntentHandler(),
			new FallbackIntentHandler(), new ErrorHandler(), new SessionEndedRequestHandler())
		.addExceptionHandler(new SkillExceptionHandler()).withSkillId(System.getProperty("ALEXA_SKILL_ID"))
		.build();
    }

}