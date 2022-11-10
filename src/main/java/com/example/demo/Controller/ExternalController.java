package com.example.demo.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/external")

public class ExternalController {

    public static final Logger LOGGER= LoggerFactory.getLogger(ExternalController.class);

    @GetMapping("/courses")
    public ResponseEntity<Object> getClientCourses()
    {
        LOGGER.info("Getting external client courses");
        String uri="http://localhost:3000/api/courses";
        RestTemplate restTemplate=new RestTemplate();
        Object o=restTemplate.getForObject(uri,Object.class);
        return ResponseEntity.ok(o);
    }
}
