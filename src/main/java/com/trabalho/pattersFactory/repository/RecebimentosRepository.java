package com.trabalho.pattersFactory.repository;

import com.trabalho.pattersFactory.model.RecebimentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentosRepository extends JpaRepository<RecebimentosModel, Long> {
}
