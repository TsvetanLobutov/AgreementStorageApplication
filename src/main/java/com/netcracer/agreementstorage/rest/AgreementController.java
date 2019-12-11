package com.netcracer.agreementstorage.rest;

import com.netcracer.agreementstorage.domain.model.Agreement;
import com.netcracer.agreementstorage.domain.service.AgreementService;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/agreements")
public class AgreementController {

    private AgreementService agreementService;


    public AgreementController(AgreementService agreementService) {
        this.agreementService = agreementService;
    }

    @PostMapping
    public String saveAgreement(@RequestBody Agreement agreement) {
        return agreementService.saveAgreement(agreement);
    }

    @GetMapping
    public Agreement getAgreement(@RequestParam String fileName) {
        return agreementService.getAgreement(fileName);
    }
}
