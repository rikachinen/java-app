package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DevelopingSoftware {
  private static final Logger logger = LogManager.getLogger("Logging User Agent");
  
  @GetMapping({"/displayua"})
  public String index(@RequestHeader("User-Agent") String userAgent) {
    logger.info(userAgent);
    return "Accesed from Remote Site3: " + userAgent;
  }
}