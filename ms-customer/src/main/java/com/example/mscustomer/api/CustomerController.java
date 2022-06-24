package com.example.mscustomer.api;

import com.example.mscustomer.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/customer")
public class CustomerController {

    private ProjectService projectService;

    @Autowired
    public CustomerController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String testCustomer() {
        String result = projectService.skynetProject();
        return "Pepe Problemas - " + result;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getCustomer() {
        String result = projectService.testProject();
        return "Endpoint getCustomer - " + result;
    }
}
