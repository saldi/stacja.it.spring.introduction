package it.stacja.app.web.wykop.app;

import it.stacja.app.web.wykop.app.image.PageImageResolver;
import it.stacja.app.web.wykop.domain.Wykop;
import it.stacja.app.web.wykop.infrastructure.WykopRepository;
import org.springframework.stereotype.Component;

@Component
public class WykopFactory {

  private PageImageResolver pageImageResolver;

  public WykopFactory(PageImageResolver pageImageResolver) {
    this.pageImageResolver = pageImageResolver;
  }

  public Wykop createWykop(CreateWykopRequest request) {

    Wykop wykop = new Wykop();
    wykop.setName(request.getName());
    wykop.setDescription(request.getDescription());
    wykop.setPageUrl(request.getPageUrl());
    wykop.setPageImageUrl(pageImageResolver.resolveImageURL(request.getPageUrl()));
    return wykop;

  }


}
