package com.formation.repository;

import com.formation.entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository  extends JpaRepository<Formation ,Long> {
}
