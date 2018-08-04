package it.stacja.app.simple;

import it.stacja.app.factory.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleSpringExample {


  public static void main(String[] args) {

    ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

    Car car = ctx.getBean(Car.class);

    StringService service = ctx.getBean(StringService.class);

    String text = "Ala Ma KOTA";
    System.out.println(service.processString(text));


  }

}
