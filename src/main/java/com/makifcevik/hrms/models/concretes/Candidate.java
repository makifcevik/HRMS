package com.makifcevik.hrms.models.concretes;

import com.makifcevik.hrms.core.models.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Table(name = "candidates")
@Entity
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User
{
    @Column(name = "job_position_applied")
    private String jobPositionApplied;
}
