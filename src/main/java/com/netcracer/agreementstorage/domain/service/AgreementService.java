package com.netcracer.agreementstorage.domain.service;

import com.netcracer.agreementstorage.domain.model.Agreement;

public interface AgreementService {
    public String saveAgreement(Agreement agreement);

    public Agreement getAgreement(String filePath);
}
