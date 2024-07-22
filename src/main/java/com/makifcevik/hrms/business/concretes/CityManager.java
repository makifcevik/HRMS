package com.makifcevik.hrms.business.concretes;

import com.makifcevik.hrms.business.abstracts.CityService;
import com.makifcevik.hrms.persistence.abstracts.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityManager implements CityService
{
    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao)
    {
        this.cityDao = cityDao;
    }
}
