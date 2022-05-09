package com.example.inventivit_miniproject.repositories;

import com.example.inventivit_miniproject.entities.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseDao extends JpaRepository<Case, Long> {
}
