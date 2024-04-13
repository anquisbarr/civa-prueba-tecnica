package com.civa.futbolistas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.civa.futbolistas.model.Posicion;

public interface PosicionRepository extends JpaRepository<Posicion, Long> {

}
