package gr.dgk.alexa.skills.population.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.ask.servlet.ServletConstants;

@Configuration
public class AlexaSkillServletConfig {
    @Autowired
    private AlexaSkillPropeties alexaSkillPropetries;

    @Bean
    public void configureAlexaSkillServletConfig() {
	/* define properties */
	System.setProperty(ServletConstants.TIMESTAMP_TOLERANCE_SYSTEM_PROPERTY,
		alexaSkillPropetries.getTimestampTolerance());
	System.setProperty(ServletConstants.DISABLE_REQUEST_SIGNATURE_CHECK_SYSTEM_PROPERTY,
		alexaSkillPropetries.getDisableRequestSignatureCheck());
	System.setProperty("ALEXA_SKILL_ID", alexaSkillPropetries.getId());
    }
}