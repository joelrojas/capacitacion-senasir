package com.example.msproject.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/project")
public class ProjectController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String testProject() {
        System.out.println("INVOCANDO AL ENDPOINT TEST");
        return "Endpoint testProject";
    }

    @RequestMapping(value = "/skynet", method = RequestMethod.GET)
    public String getProject() {
        System.out.println("INVOCANDO AL ENDPOINT SKYNET");
        return "Project Skynet";
    }
}
