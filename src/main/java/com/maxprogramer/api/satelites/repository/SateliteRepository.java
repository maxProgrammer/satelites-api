package com.maxprogramer.api.satelites.repository;

import com.maxprogramer.api.satelites.model.SateliteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SateliteRepository extends JpaRepository<SateliteModel, Long> {

    SateliteModel findSateliteModelById(int id);
}
