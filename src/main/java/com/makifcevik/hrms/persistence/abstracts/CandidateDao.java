package com.makifcevik.hrms.persistence.abstracts;

import com.makifcevik.hrms.models.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CandidateDao extends JpaRepository<Candidate, UUID>
{
}
