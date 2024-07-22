package com.makifcevik.hrms.models.concretes;

import com.makifcevik.hrms.core.models.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User
{
    @Column(name = "company_name")
    private String companyName;

    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;
}
