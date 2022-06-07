package com.example.app.repository;

import com.example.app.entity.Proffeseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfRepository extends JpaRepository<Proffeseur,Long> {
}
