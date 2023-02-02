package com.example.hpos.repositories;

import com.example.hpos.entities.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialistRepository extends JpaRepository<Specialist,Integer> {
}
