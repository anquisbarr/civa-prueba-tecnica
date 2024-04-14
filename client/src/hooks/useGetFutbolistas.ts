import { useState, useEffect } from "react";
import type { Futbolista } from "../types/futbolista";

const useFutbolistas = () => {
  const [futbolistas, setFutbolistas] = useState([] as Futbolista[]);

  const fetchFutbolistas = async () => {
    const response = await fetch("http://localhost:8080/futbolista");
    const data = await response.json();
    setFutbolistas(data);
  };

  useEffect(() => {
    fetchFutbolistas();
  }, [fetchFutbolistas]);

  return futbolistas;
};

export default useFutbolistas;
