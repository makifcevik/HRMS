package com.makifcevik.hrms.business.abstracts;

import com.makifcevik.hrms.core.utilities.results.DataResult;
import com.makifcevik.hrms.core.utilities.results.Result;
import com.makifcevik.hrms.models.concretes.JobAdvertisement;

import java.time.LocalDate;
import java.util.UUID;

public interface EmployerService
{
    DataResult<JobAdvertisement> createJobAdvertisement(UUID jobPositionId,
                                                        UUID cityId,
                                                        UUID employerId,
                                                        String jobDescription,
                                                        double minSalary,
                                                        double maxSalary,
                                                        int openPositions,
                                                        LocalDate lastApplicationDate);
}
