package it.stacja.app.web.api.web;

import it.stacja.app.web.api.domain.Config;
import it.stacja.app.web.api.infrastructure.ConfigurationRepository;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/config")
public class ImageConfigController {

  private ConfigurationRepository configurationRepository;

  public ImageConfigController(
      ConfigurationRepository configurationRepository) {
    this.configurationRepository = configurationRepository;
  }


  @PutMapping("/{name}")
  public void saveConfig(@PathVariable("name") String name, @RequestBody String config) {
    Config cfg = new Config();
    cfg.setName(name);
    cfg.setConfig(config);
    configurationRepository.save(cfg);
  }

  @GetMapping("/{name}")
  public String loadConfig(@PathVariable("name") String name) {
    Optional<Config> config = configurationRepository.findById(name);
    Config c = config.orElse(new Config());
    return c.getConfig();
  }


}
