package it.stacja.app.web.wykop.infrastructure;

import it.stacja.app.web.wykop.domain.Wykop;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WykopRepository extends JpaRepository<Wykop, Long> {


}
