package com.makifcevik.hrms.business.abstracts;

import com.makifcevik.hrms.core.models.User;
import com.makifcevik.hrms.core.utilities.results.DataResult;
import com.makifcevik.hrms.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UserService
{
    DataResult<List<User>> getAll();
    Result add(User user);
    DataResult<User> getById(UUID id);
    Result deleteById(UUID id);
    Result updateById(User user);
}
