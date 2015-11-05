package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class UiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UiApplication.class, args);
    }
}


@RestController
@RequestMapping("/api")
class UiRestController {
	
	@RequestMapping("/resource")
	public Map<String, Object> home() {
		Map<String, Object> model =  new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content",  "Hello World");	
		return model;
	}
	
} 