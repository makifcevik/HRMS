package com.makifcevik.hrms.business.concretes;

import com.makifcevik.hrms.business.abstracts.EmployerService;
import com.makifcevik.hrms.persistence.abstracts.EmployerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerManager implements EmployerService
{
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao)
    {
        this.employerDao = employerDao;
    }
}
