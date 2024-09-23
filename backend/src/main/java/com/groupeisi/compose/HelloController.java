package com.groupeisi.compose;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping("/api/text")
  public String saySomething() {
    return "Ok ça marche";
  }
}
