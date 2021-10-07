package p3.demo.controladorbbdd;

import java.util.List;
import java.util.Optional;

public interface UsuarioDao {
	int count();

	int save(Usuario usuario);

	int update(Usuario usuario);

	int deleteById(int id);

	List<Usuario> findAll();

	List<Usuario> FindByNombreAndPuntuacion(String nombre, Integer puntuacion);

	Optional<Usuario> findById(Integer id);

	String getNombreById(Integer id);
}
