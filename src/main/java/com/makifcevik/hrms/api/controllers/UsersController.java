package com.makifcevik.hrms.api.controllers;

import com.makifcevik.hrms.business.abstracts.UserService;
import com.makifcevik.hrms.core.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController
{
    private UserService userService;

    @Autowired
    public UsersController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping("/getall")
    public List<User> getAll()
    {
        return userService.getAll();
    }
}
