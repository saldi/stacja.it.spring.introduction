package it.stacja.app.web.wykop.app;

import it.stacja.app.web.wykop.domain.Wykop;
import it.stacja.app.web.wykop.infrastructure.WykopRepository;
import it.stacja.app.web.wykop.webapp.CreateWykopRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    this.wykopFactory.createWykop(request);
  }

  @Override
  public List<Wykop> selectAll() {
    return wykopRepository.findAll();
  }
}
