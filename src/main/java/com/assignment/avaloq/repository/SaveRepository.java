package com.assignment.avaloq.repository;

import com.assignment.avaloq.model.BuzzFizzDatabaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaveRepository extends JpaRepository<BuzzFizzDatabaseModel, String> {
}
