package com.netcracer.agreementstorage.persistence;

import com.netcracer.agreementstorage.domain.model.Agreement;

public interface AgreementRepository {

    public String saveAgreement(Agreement agreement);

    public Agreement getAgreement(String filePath);
}
