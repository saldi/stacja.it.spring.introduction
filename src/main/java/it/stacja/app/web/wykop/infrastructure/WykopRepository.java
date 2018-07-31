package it.stacja.app.web.wykop.infrastructure;

import it.stacja.app.web.wykop.domain.Wykop;

import java.util.List;

public interface WykopRepository {

    void save(Wykop wykop);

    List<Wykop> findAll();


}
