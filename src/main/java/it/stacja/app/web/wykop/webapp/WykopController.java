package it.stacja.app.web.wykop.webapp;

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
public class WykopController {

  private WykopService wykopService;

  public WykopController(WykopService wykopService) {
    this.wykopService = wykopService;
  }

  @GetMapping("/main")
  public void main() {

  }

  @PostMapping("/add")
  public String add(CreateWykopRequest request) {
    wykopService.createWykop(request);
    return "redirect:list";
  }

  @GetMapping("/list")
  public void list(Map pageMap) {
    List<Wykop> list = wykopService.selectAll();
    pageMap.put("list", list);
  }

}
