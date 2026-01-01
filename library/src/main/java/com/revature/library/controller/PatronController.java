package com.revature.library.controller;

import com.revature.library.model.Patron;
import com.revature.library.repository.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/patrons")
public class PatronController {

    private final PatronRepository patronRepository;

    @Autowired
    public PatronController(PatronRepository patronRepository) {
        this.patronRepository = patronRepository;
    }

    @PostMapping
    public Patron createPatron(@RequestBody Patron patron) {
        return patronRepository.save(patron);
    }

    @GetMapping
    public List<Patron> getAllPatrons() {
        return patronRepository.findAll();
    }
}
