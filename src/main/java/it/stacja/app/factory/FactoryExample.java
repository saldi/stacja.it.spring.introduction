package it.stacja.app.factory;

import it.stacja.app.factory.model.Car;
import it.stacja.app.factory.model.Tire;
import it.stacja.app.factory.model.Wheel;

public class FactoryExample {

  public static void main(String[] args) {

    Tire t = new Tire();
    Wheel wheel1 = new Wheel(t);

    t = new Tire();
    Wheel wheel2 = new Wheel(t);

    t = new Tire();
    Wheel wheel3 = new Wheel(t);

    t = new Tire();
    Wheel wheel4 = new Wheel(t);

    Car car = new Car(wheel1, wheel2, wheel3, wheel4);


  }


}
