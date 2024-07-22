package com.makifcevik.hrms.business.concretes;

import com.makifcevik.hrms.business.abstracts.JobPositionService;
import com.makifcevik.hrms.persistence.abstracts.JobPositionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobPositionManager implements JobPositionService
{
    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao)
    {
        this.jobPositionDao = jobPositionDao;
    }
}
