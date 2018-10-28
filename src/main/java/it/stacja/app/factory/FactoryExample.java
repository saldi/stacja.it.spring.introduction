package it.stacja.app.factory;

import it.stacja.app.factory.context.SimpleContext;
import it.stacja.app.model.Car;

public class FactoryExample {

  public static void main(String[] args) {

    SimpleContext context = new SimpleContext("it.stacja.app.model");
    Car car = context.getObject(Car.class);
    System.out.println(car);

    car = context.getObject(Car.class);
    System.out.println(car);

    car = context.getObject(Car.class);
    System.out.println(car);

  }


}
