package com.rw.scrap.endpoint.rest.controller.health;

import com.rw.scrap.services.WebScrappingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebScrappingController {
  @Autowired
  WebScrappingService webScrappingService;

  @GetMapping("/getText")
  public String getText(@RequestParam String url){
    try {
      String text = webScrappingService.getText(url);
      System.out.println(text);
      return text;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @GetMapping("/getTitle")
  public String getTitle(@RequestParam String url){
    try {
      String text = webScrappingService.getTitle(url);
      System.out.println(text);
      return text;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
