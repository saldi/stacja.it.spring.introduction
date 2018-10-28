package it.stacja.app.web.wykop.app;

import it.stacja.app.web.wykop.domain.Wykop;

import java.util.List;

public interface WykopService {

    void createWykop(CreateWykopRequest request);

    List<Wykop> findWykop();

}
