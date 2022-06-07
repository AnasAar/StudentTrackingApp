package com.example.app.repository;

import com.example.app.entity.Abssence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbssenceRepository extends JpaRepository<Abssence,Long> {


}
