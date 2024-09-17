package com.example.demo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class StockController {

    @PostMapping("/stock")
    public String createStock(@RequestBody Stock stock) {
        //Save the stock information
        return "Saved and Name of Stock is :"  + stock.getName() + "\n" ;
    }
}