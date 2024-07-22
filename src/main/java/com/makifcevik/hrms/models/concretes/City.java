package com.makifcevik.hrms.models.concretes;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "city")
public class City
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "city")
    private List<JobAdvertisement> jobAdvertisements;
}
