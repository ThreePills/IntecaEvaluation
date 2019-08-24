package com.kacperwozniak.credit.repository;

import com.kacperwozniak.credit.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Integer> {
}
