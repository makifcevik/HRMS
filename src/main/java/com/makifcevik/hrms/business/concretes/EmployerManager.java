package com.makifcevik.hrms.business.concretes;

import com.makifcevik.hrms.business.abstracts.EmployerService;
import com.makifcevik.hrms.core.utilities.results.DataResult;
import com.makifcevik.hrms.core.utilities.results.Result;
import com.makifcevik.hrms.core.utilities.results.SuccessDataResult;
import com.makifcevik.hrms.models.concretes.City;
import com.makifcevik.hrms.models.concretes.Employer;
import com.makifcevik.hrms.models.concretes.JobAdvertisement;
import com.makifcevik.hrms.models.concretes.JobPosition;
import com.makifcevik.hrms.persistence.abstracts.CityDao;
import com.makifcevik.hrms.persistence.abstracts.EmployerDao;
import com.makifcevik.hrms.persistence.abstracts.JobAdvertisementDao;
import com.makifcevik.hrms.persistence.abstracts.JobPositionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class EmployerManager implements EmployerService
{
    private final EmployerDao employerDao;
    private final JobPositionDao jobPositionDao;
    private final CityDao cityDao;
    private final JobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao, JobPositionDao jobPositionDao, CityDao cityDao, JobAdvertisementDao jobAdvertisementDao)
    {
        this.employerDao = employerDao;
        this.jobPositionDao = jobPositionDao;
        this.cityDao = cityDao;
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    @Transactional
    public DataResult<JobAdvertisement> createJobAdvertisement(UUID jobPositionId,
                                             UUID cityId,
                                             UUID employerId,
                                             String jobDescription,
                                             double minSalary,
                                             double maxSalary,
                                             int openPositions,
                                             LocalDate lastApplicationDate)
    {
        JobPosition jobPosition = jobPositionDao.findById(jobPositionId)
                .orElseThrow(() -> new NoSuchElementException("JobPosition not found"));
        City city = cityDao.findById(cityId)
                .orElseThrow(() -> new NoSuchElementException("City not found"));
        Employer employer = employerDao.findById(employerId)
                .orElseThrow(() -> new NoSuchElementException("Employer not found"));

        JobAdvertisement jobAdvertisement = new JobAdvertisement();
        jobAdvertisement.setJobPosition(jobPosition);
        jobAdvertisement.setCity(city);
        jobAdvertisement.setEmployer(employer);
        jobAdvertisement.setJobDescription(jobDescription);
        jobAdvertisement.setMinSalary(minSalary);
        jobAdvertisement.setMaxSalary(maxSalary);
        jobAdvertisement.setOpenPositions(openPositions);
        jobAdvertisement.setLastApplicationDate(lastApplicationDate);

        return new SuccessDataResult<>(jobAdvertisementDao.save(jobAdvertisement));
    }
}
