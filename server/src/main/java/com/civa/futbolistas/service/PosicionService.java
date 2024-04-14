package com.civa.futbolistas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.civa.futbolistas.model.Posicion;
import com.civa.futbolistas.repository.PosicionRepository;

@Service
public class PosicionService {
  @Autowired
  private PosicionRepository posicionRepository;

  public Posicion savePosicion(Posicion posicion) {
    return posicionRepository.save(posicion);
  }

  public Iterable<Posicion> listarTodos() {
    return posicionRepository.findAll();
  }
}
