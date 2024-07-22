package com.makifcevik.hrms.models.concretes;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "job_advertisement")
public class JobAdvertisement
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "min_salary")
    private double minSalary;

    @Column(name = "max_salary")
    private double maxSalary;

    @Column(name = "open_positions")
    private int openPositions;

    @Column(name = "last_application_date")
    private LocalDate lastApplicationDate;
}
