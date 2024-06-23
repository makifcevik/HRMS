package com.makifcevik.hrms.api.controllers;

import com.makifcevik.hrms.business.abstracts.UserService;
import com.makifcevik.hrms.core.models.User;
import com.makifcevik.hrms.core.utilities.results.DataResult;
import com.makifcevik.hrms.core.utilities.results.ErrorResult;
import com.makifcevik.hrms.core.utilities.results.Result;
import com.makifcevik.hrms.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
    public DataResult<List<User>> getAll()
    {
        return userService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user)
    {
        var userToAdd = userService.add(user);
        if (userToAdd != null)
            return new SuccessResult();
        return new ErrorResult();
    }

    @DeleteMapping("/deletebyid/{id}")
    public Result deleteById(@PathVariable UUID id)
    {
        userService.deleteById(id);
        return new SuccessResult();
    }

    @PostMapping("/update")
    public Result updateById(@RequestBody User user)
    {
        userService.updateById(user);
        return new SuccessResult();
    }
}
