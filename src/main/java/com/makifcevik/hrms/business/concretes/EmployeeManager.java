package com.makifcevik.hrms.business.concretes;

import com.makifcevik.hrms.business.abstracts.EmployerService;
import com.makifcevik.hrms.persistence.abstracts.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManager implements EmployerService
{
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao)
    {
        this.employeeDao = employeeDao;
    }
}
