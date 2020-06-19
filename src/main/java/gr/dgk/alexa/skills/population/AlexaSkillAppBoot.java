package gr.dgk.alexa.skills.population;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AlexaSkillAppBoot {
    public static void main(String[] args) {
	SpringApplication.run(AlexaSkillAppBoot.class, args);
    }
}
