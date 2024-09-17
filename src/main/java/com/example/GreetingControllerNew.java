package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class GreetingControllerNew {
    private static final String template = "New Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
    private static final Logger logger = LogManager.getLogger("Logging Input Value");

	@GetMapping("/newgreeting")
	public GreetingNew greeting(HttpServletRequest request,@RequestParam(value = "name", defaultValue = "World") String name) {
		String userAgent = request.getHeader("User-Agent");
        logger.info(userAgent);
		return new GreetingNew(counter.incrementAndGet(), String.format(template, name));
	}
}