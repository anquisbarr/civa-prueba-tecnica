import z from "zod";

export const futbolistaSchema = z.object({
  id: z.number(),
  nombres: z.string(),
  apellidos: z.string(),
  fechaNacimiento: z.string(),
  caracteristicas: z.string(),
});

export type Futbolista = z.infer<typeof futbolistaSchema>;
