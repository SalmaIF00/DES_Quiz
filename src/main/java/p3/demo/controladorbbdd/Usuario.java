package p3.demo.controladorbbdd;

//Clase Usuario
public class Usuario {
	private Integer id;
	private String nombre;
	private Integer puntuacion;

//Constructor
	public Usuario(Integer id, String nombre, Integer puntuacion) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	// Getters y Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

}
