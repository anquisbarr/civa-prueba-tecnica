package com.civa.futbolistas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.civa.futbolistas.model.Futbolista;

public interface FutbolistaRepository extends JpaRepository<Futbolista, Long> {

}
