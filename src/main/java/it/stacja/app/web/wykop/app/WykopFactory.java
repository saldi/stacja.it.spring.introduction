package it.stacja.app.web.wykop.app;

import it.stacja.app.web.wykop.app.image.PageImageResolver;
import it.stacja.app.web.wykop.commands.CreateWykopRequest;
import it.stacja.app.web.wykop.domain.Wykop;
import it.stacja.app.web.wykop.infrastructure.WykopRepository;
import org.springframework.stereotype.Component;

public class WykopFactory {

    private WykopRepository wykopRepository;
    private PageImageResolver pageImageResolver;

    public WykopFactory(WykopRepository wykopRepository,
                        PageImageResolver pageImageResolver) {
        this.wykopRepository = wykopRepository;
        this.pageImageResolver = pageImageResolver;
    }

    public Wykop createWykop(CreateWykopRequest request) {
        String imageURL = pageImageResolver.resolveImageURL(request.getUrl());
        Wykop wykop = Wykop.from(request, imageURL);
        wykopRepository.save(wykop);
        return wykop;
    }
}
