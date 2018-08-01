package it.stacja.app.web.wykop.app;

import it.stacja.app.web.wykop.commands.CreateWykopRequest;
import it.stacja.app.web.wykop.domain.Wykop;
import it.stacja.app.web.wykop.infrastructure.WykopRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultWykopService implements WykopService {

    private WykopFactory wykopFactory;
    private WykopRepository wykopRepository;

    public DefaultWykopService(WykopFactory wykopFactory,
                               WykopRepository wykopRepository) {
        this.wykopFactory = wykopFactory;
        this.wykopRepository = wykopRepository;
    }

    @Override
    public void createWykop(CreateWykopRequest request) {
        Wykop wykop = wykopFactory.createWykop(request);
        wykopRepository.save(wykop);
    }

    @Override
    public List<Wykop> findWykop() {
        return wykopRepository.findAll();
    }
}
