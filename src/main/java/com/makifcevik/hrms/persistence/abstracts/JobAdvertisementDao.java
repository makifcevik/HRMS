package com.makifcevik.hrms.persistence.abstracts;

import com.makifcevik.hrms.core.utilities.results.DataResult;
import com.makifcevik.hrms.models.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, UUID>
{
    @Query("From JobAdvertisement Where jobPosition.id=:jobPositionId")
    List<JobAdvertisement> getByJobPosition(int jobPositionId);

    @Query("From JobAdvertisement Where city.id=:cityId")
    List<JobAdvertisement> getByCity(int cityId);

    @Query("From JobAdvertisement Where minSalary<=:salary")
    List<JobAdvertisement> getAboveMinSalary(double salary);
}
