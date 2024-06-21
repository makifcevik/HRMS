package com.makifcevik.hrms.business.abstracts;

import com.makifcevik.hrms.core.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService
{
    List<User> getAll();
}
