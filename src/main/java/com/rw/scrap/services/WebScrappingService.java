package com.rw.scrap.services;

import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
@AllArgsConstructor
public class WebScrappingService {
  public String getText(String url) {
    try {
      Document document = Jsoup.connect(url).get();
      return document.text();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public String getTitle(String url){
    try {
      Document document = Jsoup.connect(url).get();
      return document.title();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
