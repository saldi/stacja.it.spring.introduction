package it.stacja.app.simple;

import it.stacja.app.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleSpringExample {


  public static void main(String[] args) {

    ApplicationContext ctx =
        new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

//    Car car = ctx.getBean(Car.class);
//    System.out.println(car);
//    car = ctx.getBean(Car.class);
//    System.out.println(car);
//    car = ctx.getBean(Car.class);
//    System.out.println(car);

    CarManager carManager = ctx.getBean(CarManager.class);
    System.out.println(carManager);


  }

}
