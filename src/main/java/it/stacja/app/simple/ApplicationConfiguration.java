package it.stacja.app.simple;

import it.stacja.app.factory.model.Tire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackages = {"it.stacja.app.factory.model", "it.stacja.app.simple"})
public class ApplicationConfiguration {


}
