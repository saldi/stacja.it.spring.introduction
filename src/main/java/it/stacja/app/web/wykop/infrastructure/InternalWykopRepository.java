package it.stacja.app.web.wykop.infrastructure;

import it.stacja.app.web.wykop.domain.Wykop;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

//@Component
public class InternalWykopRepository {//implements WykopRepository {

  private List<Wykop> list = new ArrayList<>();

  public void save(Wykop wykop) {
    list.add(wykop);
  }

  public List<Wykop> findAll() {
    return new ArrayList(list);
  }
}
