package com.makifcevik.hrms.business.concretes;

import com.makifcevik.hrms.business.abstracts.CandidateService;
import com.makifcevik.hrms.persistence.abstracts.CandidateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateManager implements CandidateService
{
    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao)
    {
        this.candidateDao = candidateDao;
    }
}
