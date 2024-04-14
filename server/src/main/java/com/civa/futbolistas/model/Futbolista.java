package com.civa.futbolistas.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Futbolista {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombres;
  private String apellidos;
  private LocalDate fechaNacimiento;
  private String caracteristicas;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "posicion_id")
  @JsonBackReference
  private Posicion posicion;

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getCaracteristicas() {
    return caracteristicas;
  }

  public void setCaracteristicas(String caracteristicas) {
    this.caracteristicas = caracteristicas;
  }

  public Posicion getPosicion() {
    return posicion;
  }

  public void setPosicion(Posicion posicion) {
    this.posicion = posicion;
  }

  // Create the toString method
  @Override
  public String toString() {
    return "Futbolista [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento="
        + fechaNacimiento + ", caracteristicas=" + caracteristicas + ", posicion=" + posicion + "]";
  }
}
