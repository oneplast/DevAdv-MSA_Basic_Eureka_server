package org.example.serviceb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class ApiController {

    @Autowired
    private Environment env;

    @GetMapping("/hello")
    public String hello() {
        String port = env.getProperty("local.server.port");

        return "Hello from service-a on port = " + port;
    }
}
