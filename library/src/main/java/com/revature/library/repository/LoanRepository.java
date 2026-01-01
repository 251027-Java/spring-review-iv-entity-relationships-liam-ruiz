package com.revature.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.library.model.Loan;
import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByPatronId(Long patronId);
    List<Loan> findByReturnDateIsNull();
}
