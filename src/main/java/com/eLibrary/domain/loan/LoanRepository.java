package com.eLibrary.domain.loan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface LoanRepository extends JpaRepository<LoanEntity, Long> {

}