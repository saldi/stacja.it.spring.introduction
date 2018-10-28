package it.stacja.app.simple;

import it.stacja.app.model.Car;

//@Component
public class CarManager {


  private Car car;

  public CarManager() {
  }

  public CarManager(Car car) {
    this.car = car;
  }

//  @Autowired
  public void setCar(Car car) {
    this.car = car;
  }

  @Override
  public String toString() {
    return "CarManager{" +
        "car=" + car +
        '}';
  }
}
