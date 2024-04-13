package com.civa.futbolistas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.civa.futbolistas.model.Posicion;
import com.civa.futbolistas.service.PosicionService;

@RestController
@RequestMapping("/posicion")
public class PosicionController {
  @Autowired
  private PosicionService posicionService;

  @PostMapping("/agregar")
  public ResponseEntity<Posicion> addPosicion(@RequestBody Posicion posicion) {
    Posicion nuevaPosicion = posicionService.savePosicion(posicion);
    return new ResponseEntity<>(nuevaPosicion, HttpStatus.CREATED);
  }
}
