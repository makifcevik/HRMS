package com.makifcevik.hrms.persistence.abstracts;

import com.makifcevik.hrms.models.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeDao extends JpaRepository<Employee, UUID>
{
}
