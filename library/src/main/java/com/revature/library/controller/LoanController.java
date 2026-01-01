package com.revature.library.controller;

import com.revature.library.model.Loan;
import com.revature.library.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LoanController {

    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/loans")
    public Loan createLoan(@RequestParam Long bookId, @RequestParam Long patronId) {
        return loanService.createLoan(bookId, patronId);
    }

    @PutMapping("/loans/{id}/return")
    public Loan returnLoan(@PathVariable Long id) {
        return loanService.returnLoan(id);
    }

    @GetMapping("/loans/active")
    public List<Loan> getActiveLoans() {
        return loanService.getActiveLoans();
    }

    @GetMapping("/patrons/{id}/loans")
    public List<Loan> getLoansByPatron(@PathVariable Long id) {
        return loanService.getLoansByPatron(id);
    }
}
