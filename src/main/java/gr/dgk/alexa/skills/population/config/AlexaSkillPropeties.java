package gr.dgk.alexa.skills.population.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "alexa.skill")
public class AlexaSkillPropeties {
    private String id;
    private String timestampTolerance;
    private String disableRequestSignatureCheck;

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getTimestampTolerance() {
	return timestampTolerance;
    }

    public void setTimestampTolerance(String timestampTolerance) {
	this.timestampTolerance = timestampTolerance;
    }

    public String getDisableRequestSignatureCheck() {
	return disableRequestSignatureCheck;
    }

    public void setDisableRequestSignatureCheck(String disableRequestSignatureCheck) {
	this.disableRequestSignatureCheck = disableRequestSignatureCheck;
    }
}
