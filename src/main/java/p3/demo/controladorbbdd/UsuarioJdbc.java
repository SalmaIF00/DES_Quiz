package p3.demo.controladorbbdd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioJdbc implements UsuarioDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int save(Usuario usuario) {
		return jdbcTemplate.update("INSERT INTO Usuarios (nombre, puntuacion) values(?,?)", 
				usuario.getNombre(),
				usuario.getPuntuacion());
	}
	
	@Override
	public List<Usuario> findAll() {
	return jdbcTemplate.query("SELECT * FROM Usuarios", (rs, rowNum) -> 
	new Usuario(rs.getInt("id"), rs.getString("nombre"),rs.getInt("puntos")));
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Usuario> FindByNombreAndPuntuacion(String nombre, Integer puntuacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNombreById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
