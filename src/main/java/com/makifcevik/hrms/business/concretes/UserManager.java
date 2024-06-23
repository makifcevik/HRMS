package com.makifcevik.hrms.business.concretes;

import com.makifcevik.hrms.business.abstracts.UserService;
import com.makifcevik.hrms.core.models.User;
import com.makifcevik.hrms.core.utilities.results.*;
import com.makifcevik.hrms.persistence.abstracts.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserManager implements UserService
{
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao)
    {
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll()
    {
        return new SuccessDataResult<>(userDao.findAll());
    }

    @Override
    public Result add(User user)
    {
        userDao.save(user);
        return new SuccessResult();
    }

    @Override
    public DataResult<User> getById(UUID id)
    {
        var user = userDao.findById(id);
        if (user.isPresent())
        {
            return new SuccessDataResult<User>(user.get());
        }
        return new ErrorDataResult<>();
    }

    @Override
    public Result deleteById(UUID id)
    {
        var userToDeleteOpt = userDao.findById(id);
        if (userToDeleteOpt.isPresent())
        {
            userDao.deleteById(id);
            return new SuccessResult();
        }
        return new ErrorResult();
    }

    @Override
    public Result updateById(User user)
    {
        var userToUpdateOpt = userDao.findById(user.getId());
        if (userToUpdateOpt.isPresent())
        {
            var userToUpdate = userToUpdateOpt.get();
            userToUpdate.setFirstName(user.getFirstName());
            userToUpdate.setLastName(user.getLastName());
            userToUpdate.setBirthday(user.getBirthday());
            userToUpdate.setEmail(user.getEmail());
            return new SuccessResult();
        }
        return new ErrorResult();
    }
}
