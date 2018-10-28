package it.stacja.app.web.api.infrastructure;

import it.stacja.app.web.api.domain.Config;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigurationRepository extends MongoRepository<Config, String> {

}
