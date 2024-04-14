import useFutbolistas from "../hooks/useGetFutbolistas";

const TableComponent = () => {
  const futbolistas = useFutbolistas();

  return (
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Nombres</th>
          <th>Apellidos</th>
          <th>Fecha de Nacimiento</th>
          <th>Características</th>
          <th>Posición</th>
        </tr>
      </thead>
      <tbody>
        {futbolistas.map((futbolista) => (
          <tr key={futbolista.id}>
            <td>{futbolista.id}</td>
            <td>{futbolista.nombres}</td>
            <td>{futbolista.apellidos}</td>
            <td>{futbolista.fechaNacimiento}</td>
            <td>{futbolista.caracteristicas}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
};

export default TableComponent;
