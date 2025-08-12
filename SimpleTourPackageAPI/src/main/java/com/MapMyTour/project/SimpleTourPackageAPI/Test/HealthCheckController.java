package com.MapMyTour.project.SimpleTourPackageAPI.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @GetMapping("/check")
    public HelloWorld health() {
        return new HelloWorld("Hello World");
    }

    @GetMapping("/check/{Name}")
    public HelloWorld healthCheck(@PathVariable String Name) {
        return new HelloWorld("Hello!" + Name);
    }
}
