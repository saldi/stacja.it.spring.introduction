package it.stacja.app.web.wykop.web;

import it.stacja.app.web.wykop.app.WykopService;
import it.stacja.app.web.wykop.commands.CreateWykopRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

public class WykopController {

    private WykopService wykopService;

    public WykopController(WykopService wykopService) {
        this.wykopService = wykopService;
    }


    public void main() {

    }


}
