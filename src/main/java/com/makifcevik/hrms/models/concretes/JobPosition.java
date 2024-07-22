package com.makifcevik.hrms.models.concretes;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "job_position")
public class JobPosition
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "jobPosition")
    private List<JobAdvertisement> jobAdvertisements;
}
