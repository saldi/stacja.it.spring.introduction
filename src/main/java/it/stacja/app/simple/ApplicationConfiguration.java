package it.stacja.app.simple;

import it.stacja.app.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"it.stacja.app"})
public class ApplicationConfiguration {

  @Autowired
  private Car car;

  @Bean
  public CarManager carManager(){
    return new CarManager(this.car);
  }




}
