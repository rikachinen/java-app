package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
    private static final Logger logger = LogManager.getLogger("Logging Input Value");

	@GetMapping("/greeting")
	public Greeting greeting(HttpServletRequest request,@RequestParam(value = "name", defaultValue = "World") String name) {
		String userAgent = request.getHeader("User-Agent");
        logger.info(userAgent);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
