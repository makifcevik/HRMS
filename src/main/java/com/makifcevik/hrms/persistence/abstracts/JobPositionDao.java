package com.makifcevik.hrms.persistence.abstracts;

import com.makifcevik.hrms.models.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobPositionDao extends JpaRepository<JobPosition, UUID>
{
}
