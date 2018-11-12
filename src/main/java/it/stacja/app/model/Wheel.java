package it.stacja.app.model;

import it.stacja.app.factory.context.ContextBean;
import it.stacja.app.factory.context.Proto;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ContextBean
@Proto
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Wheel {

  private Tire tire;

  public Wheel(Tire tire) {
    System.out.println("Tworzę koło");
    this.tire = tire;
  }

  @Override
  public String toString() {
    return "Wheel{" +
        "tire=" + tire +
        '}';
  }
}
