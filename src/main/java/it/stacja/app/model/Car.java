package it.stacja.app.model;

import it.stacja.app.factory.context.ContextBean;
import org.springframework.stereotype.Component;

@ContextBean
@Component
public class Car {

  private Wheel fr;
  private Wheel fl;
  private Wheel rr;
  private Wheel rl;

  public Car(Wheel fr, Wheel fl, Wheel rr, Wheel rl) {
    System.out.println("Tworzę samochód");
    this.fr = fr;
    this.fl = fl;
    this.rr = rr;
    this.rl = rl;
  }

  @Override
  public String toString() {
    return "Car{" +
        "fr=" + fr +
        ", fl=" + fl +
        ", rr=" + rr +
        ", rl=" + rl +
        '}';
  }

  public Wheel replaceFRWheel(Wheel wheel){
    Wheel oldWheel = this.fr;
    this.fr = wheel;
    return oldWheel;
  }
}
