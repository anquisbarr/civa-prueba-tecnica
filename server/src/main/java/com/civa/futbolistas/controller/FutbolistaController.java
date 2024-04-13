package com.civa.futbolistas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.civa.futbolistas.model.Futbolista;
import com.civa.futbolistas.service.FutbolistaService;

@RestController
@RequestMapping("/futbolista")
public class FutbolistaController {
  @Autowired
  private FutbolistaService futbolistaService;

  @GetMapping
  public List<Futbolista> listarTodos() {
    return futbolistaService.listarTodos();
  }

  @PostMapping("/agregar")
  public ResponseEntity<Futbolista> addFutbolista(@RequestBody Futbolista futbolista) {
    // log.info("Attempting to add a new futbolista: {}", futbolista);
    Futbolista nuevoFutbolista = futbolistaService.saveFutbolista(futbolista);
    // log.info("Added a new futbolista: {}", nuevoFutbolista);
    return new ResponseEntity<>(nuevoFutbolista, HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Futbolista> obtenerPorId(@PathVariable Long id) {
    return futbolistaService.obtenerPorId(id)
        .map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build());
  }

}
