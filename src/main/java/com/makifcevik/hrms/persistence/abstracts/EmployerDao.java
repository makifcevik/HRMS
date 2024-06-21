package com.makifcevik.hrms.persistence.abstracts;

import com.makifcevik.hrms.models.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployerDao extends JpaRepository<Employer, UUID>
{
}
