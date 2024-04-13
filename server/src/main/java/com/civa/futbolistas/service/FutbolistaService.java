package com.civa.futbolistas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.civa.futbolistas.model.Futbolista;
import com.civa.futbolistas.repository.FutbolistaRepository;
import com.civa.futbolistas.repository.PosicionRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FutbolistaService {
  @Autowired
  private FutbolistaRepository futbolistaRepository;

  @Autowired
  private PosicionRepository posicionRepository;

  public List<Futbolista> listarTodos() {
    return futbolistaRepository.findAll();
  }

  public Optional<Futbolista> obtenerPorId(Long id) {
    return futbolistaRepository.findById(id);
  }

  public Futbolista saveFutbolista(Futbolista futbolista) {
    // return futbolistaRepository.save(futbolista);
    if (futbolista.getPosicion() != null && !posicionRepository.existsById(futbolista.getPosicion().getId())) {
      throw new EntityNotFoundException("Posicion with id " + futbolista.getPosicion().getId() + " not found");
    }
    return futbolistaRepository.save(futbolista);

  }
}
