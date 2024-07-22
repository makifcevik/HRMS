package com.makifcevik.hrms.business.concretes;

import com.makifcevik.hrms.business.abstracts.JobAdvertisementService;
import com.makifcevik.hrms.persistence.abstracts.JobAdvertisementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobAdvertisementManager implements JobAdvertisementService
{
    private JobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao)
    {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }
}
