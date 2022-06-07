package com.example.app.repository;


import com.example.app.entity.Devoir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevoirRepository  extends JpaRepository<Devoir,Long> {
}
