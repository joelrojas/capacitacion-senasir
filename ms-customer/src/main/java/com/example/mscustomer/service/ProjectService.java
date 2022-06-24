package com.example.mscustomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(name = "ms-project")
public interface ProjectService {

    @RequestMapping(value = "/v1/api/project/skynet", method = RequestMethod.GET)
    String skynetProject();

    @RequestMapping(value = "/v1/api/project/test", method = RequestMethod.GET)
    String testProject();
}
