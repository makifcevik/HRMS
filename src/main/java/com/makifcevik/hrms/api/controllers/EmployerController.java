package com.makifcevik.hrms.api.controllers;

import com.makifcevik.hrms.business.abstracts.EmployerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employer")
public class EmployerController
{
    private final EmployerService employerService;

    public EmployerController(EmployerService employerService)
    {
        this.employerService = employerService;
    }


}
