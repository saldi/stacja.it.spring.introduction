package it.stacja.app.web.api.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/image")
public class ConfigController {

  @GetMapping("/main")
  public String main(){
    return "image/main";
  }


}
