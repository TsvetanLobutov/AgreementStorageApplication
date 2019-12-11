package com.netcracer.agreementstorage.domain.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Agreement extends Parent {
    private static final String NAME_PREFIX = "Agreement ";

    private String signedBy;

    public String getName() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        this.name = NAME_PREFIX + formatter.format(LocalDate.now());
        return name;
    }

    public String getSignedBy() {
        return signedBy;
    }

    public void setSignedBy(String signedBy) {
        this.signedBy = signedBy;
    }
}
