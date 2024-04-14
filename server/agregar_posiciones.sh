#!/bin/bash

# Define el host y endpoint
HOST="http://localhost:8080"
ENDPOINT="$HOST/posicion/agregar"

# Lista de posiciones a agregar
POSICIONES=("Arquero" "Defensa" "Mediocampista" "Delantero")

# Bucle para agregar cada posición
for posicion in "${POSICIONES[@]}"
do
  curl -X POST "$ENDPOINT" \
    -H "Content-Type: application/json" \
    -d "{\"nombre\": \"$posicion\"}" \
    -w "\n"  # Agrega una nueva línea para mejor legibilidad en la salida
done