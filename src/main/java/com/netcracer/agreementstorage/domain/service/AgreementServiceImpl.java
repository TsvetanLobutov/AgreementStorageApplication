package com.netcracer.agreementstorage.domain.service;

import com.netcracer.agreementstorage.domain.model.Agreement;
import com.netcracer.agreementstorage.persistence.AgreementRepository;
import org.springframework.stereotype.Service;

@Service
public class AgreementServiceImpl implements AgreementService {

    private AgreementRepository agreementRepository;

    public AgreementServiceImpl(AgreementRepository agreementRepository) {
        this.agreementRepository = agreementRepository;
    }

    @Override
    public String saveAgreement(Agreement agreement) {
        return agreementRepository.saveAgreement(agreement);
    }

    @Override
    public Agreement getAgreement(String fileName) {
        return agreementRepository.getAgreement(fileName);
    }
}
