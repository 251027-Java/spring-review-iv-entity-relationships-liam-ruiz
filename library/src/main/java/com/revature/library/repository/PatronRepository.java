package com.revature.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.library.model.Patron;

@Repository
public interface PatronRepository extends JpaRepository<Patron, Long> {
}
