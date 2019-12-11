package com.netcracer.agreementstorage.domain.exception;

public class AgreementNotFoundException extends RuntimeException {

    public AgreementNotFoundException(String message) {
        super(message);
    }
}
