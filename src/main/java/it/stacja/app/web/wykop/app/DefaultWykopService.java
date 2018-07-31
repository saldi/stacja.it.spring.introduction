package it.stacja.app.web.wykop.app;

import it.stacja.app.web.wykop.app.image.PageImageResolver;

public class DefaultWykopService implements WykopService {

    private PageImageResolver pageImageResolver;

    public DefaultWykopService(PageImageResolver pageImageResolver) {
        this.pageImageResolver = pageImageResolver;
    }
}
