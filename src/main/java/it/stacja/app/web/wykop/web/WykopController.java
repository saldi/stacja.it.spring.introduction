package it.stacja.app.web.wykop.web;

import it.stacja.app.web.wykop.app.WykopService;
import it.stacja.app.web.wykop.commands.CreateWykopRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/wykop")
public class WykopController {

    private WykopService wykopService;

    public WykopController(WykopService wykopService) {
        this.wykopService = wykopService;
    }

    @RequestMapping("/main")
    public void main() {

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(CreateWykopRequest request) {
        wykopService.createWykop(request);
        return "redirect:list";
    }

    @RequestMapping("/list")
    public void list(Map pageMap) {
        pageMap.put("list", wykopService.findWykop());
    }


}
