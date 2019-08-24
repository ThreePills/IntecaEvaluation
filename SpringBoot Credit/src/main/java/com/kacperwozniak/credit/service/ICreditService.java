package com.kacperwozniak.credit.service;

import com.kacperwozniak.credit.model.Credit;

import java.util.List;

public interface ICreditService {
    List<Credit> getCreditsList();
    void createCredit(Credit credit);
}
