package it.stacja.app.web.wykop.web;

import it.stacja.app.web.wykop.app.CreateWykopRequest;
import it.stacja.app.web.wykop.app.WykopService;
import it.stacja.app.web.wykop.domain.Wykop;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wykop")
public class MainController {

  private WykopService wykopService;

  public MainController(WykopService wykopService) {
    this.wykopService = wykopService;
  }

  @GetMapping("")
  public String showMain() {
    return "wykop/main";
  }

  @PostMapping("")
  public String saveWykop(CreateWykopRequest request) {
    wykopService.createWykop(request);
    return "redirect:wykop/list";
  }

  @GetMapping("/list")
  public String list(Map<String, Object> map) {
    List<Wykop> list = wykopService.findWykop();
    map.put("list", list);
    return "wykop/list";
  }


}
