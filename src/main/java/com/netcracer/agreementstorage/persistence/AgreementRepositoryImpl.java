package com.netcracer.agreementstorage.persistence;

import com.netcracer.agreementstorage.AgreementStorageApplication;
import com.netcracer.agreementstorage.domain.exception.AgreementNotFoundException;
import com.netcracer.agreementstorage.domain.model.Agreement;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.net.URLDecoder;

@Repository
public class AgreementRepositoryImpl implements AgreementRepository {

    @Override
    public String saveAgreement(Agreement agreement) {
        try {
            String fileName = generateFileName(agreement);
            FileOutputStream fileOut = new FileOutputStream(new File(fileName));
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(agreement);
            objectOut.close();
            return fileName;

        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.getMessage();
        }
    }

    @Override
    public Agreement getAgreement(String fileName) {
        try {
            FileInputStream fi = new FileInputStream(new File(fileName));
            ObjectInputStream oi = new ObjectInputStream(fi);
            return (Agreement) oi.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new AgreementNotFoundException("File " + fileName + " does not exist!");
        }
    }

    private String generateFileName(Agreement agreement) {
        String fileName = agreement.getName() + "-" + agreement.getSignedBy() + ".txt";
        fileName = fileName.replace(" ", "-").replace("/", "-");
        return fileName;
    }
}
