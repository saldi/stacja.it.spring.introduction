package it.stacja.app.web.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("config")
public class ConfigurationController {

    @RequestMapping(value = "/{name}", method = RequestMethod.PUT)
    public void save(@RequestBody String config, @PathVariable("name") String name) {
        System.out.println(config);
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String load() {

        return "";
    }


}
