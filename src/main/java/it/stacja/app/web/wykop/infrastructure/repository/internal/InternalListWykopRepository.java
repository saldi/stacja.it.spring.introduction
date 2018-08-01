package it.stacja.app.web.wykop.infrastructure.repository.internal;

import it.stacja.app.web.wykop.domain.Wykop;
import it.stacja.app.web.wykop.infrastructure.WykopRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class InternalListWykopRepository implements WykopRepository {

    private List<Wykop> list;

    public InternalListWykopRepository() {
        this.list = new ArrayList<>();
    }

    @Override
    public void save(Wykop wykop) {
        this.list.add(wykop);
    }

    @Override
    public List<Wykop> findAll() {
        return new ArrayList<>(list);
    }
}
