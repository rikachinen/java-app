package com.example.demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetLocationInfoFromAccesspt {
  private static final Logger logger = LogManager.getLogger("Logging: Access Point ID a specific user is connected to");
  
  @GetMapping({"/uelocationlookup"})
  public String index(@RequestHeader("X-Api-AccessPointID") String accesspointid) {
    String hardcodedlatitude = "80.123";
    String hardcodedlongitude = "70.123";
    logger.info("Received a request from Access Point ID of " + accesspointid);
    return "Accesed from: " + accesspointid + ": Latitude: " + hardcodedlatitude + ": Longitude: " + hardcodedlongitude;
  }

}