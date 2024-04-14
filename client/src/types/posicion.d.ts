import z from "zod";
import { futbolistaSchema } from "./futbolista";

export const posicionSchema = z.object({
  id: z.number(),
  nombre: z.number(),
  futbolistas: z.array(futbolistaSchema),
});

export type Posicion = z.infer<typeof Posicion>;
