package it.stacja.app.web.wykop.app;

import it.stacja.app.web.wykop.domain.Wykop;
import it.stacja.app.web.wykop.infrastructure.WykopRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
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
    this.wykopRepository.save(wykop);
  }

  @Override
  public List<Wykop> findWykop() {
    return this.wykopRepository.findAll();
  }
}
