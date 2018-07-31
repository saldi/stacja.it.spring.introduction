package it.stacja.app.web.wykop.domain;

import it.stacja.app.web.wykop.infrastructure.WykopRepository;

public class WykopFactory {

    private WykopRepository wykopRepository;

    public WykopFactory(WykopRepository wykopRepository) {
        this.wykopRepository = wykopRepository;
    }

    public void createWykop() {

    }
}
