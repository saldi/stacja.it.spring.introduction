package it.stacja.app.model;

import it.stacja.app.factory.context.ContextBean;
import it.stacja.app.factory.context.Proto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ContextBean
@Proto
@Component
@Scope("prototype")
public class Tire {

  public Tire() {
    System.out.println("Tworzy się opona");
  }
}
