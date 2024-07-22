package com.makifcevik.hrms.models.concretes;

import com.makifcevik.hrms.core.models.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employee extends User
{
    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "department")
    private String department;

    @Column(name = "salary")
    private double salary;
}
