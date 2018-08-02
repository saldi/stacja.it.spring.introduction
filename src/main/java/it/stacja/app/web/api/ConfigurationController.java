package it.stacja.app.web.api;

import it.stacja.app.web.api.domain.Config;
import it.stacja.app.web.api.mongo.ConfigRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("config")
public class ConfigurationController {

    private ConfigRepository configRepository;

    public ConfigurationController(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.PUT)
    public void save(@RequestBody String config, @PathVariable("name") String name) {
        this.configRepository.save(new Config(name, config));
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String load(@PathVariable("name") String name) {
        return this.configRepository.findById(name).get().getConfig();
    }


}
