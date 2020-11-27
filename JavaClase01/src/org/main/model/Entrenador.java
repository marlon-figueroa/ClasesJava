package org.main.model;

public class Entrenador extends SeleccionFutbol {

	private String Titulacion;
	private int aniosExperiencia;

	public Entrenador() {
		// TODO Auto-generated constructor stub
	}

	public Entrenador(int id, String nombre, String apellidos, int aniosExperiencia, int edad) {
		this.setId(id);
		this.setAniosExperiencia(aniosExperiencia);
		this.setEdad(edad);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
	}

	@Override
	public void entrenamiento() {
		System.out.println("Dirige un entrenamiento (Clase Entrenador)");
	}

	@Override
	public void partidoFutbol() {
		System.out.println("Dirige un Partido (Clase Entrenador)");
	}

	public void planificarEntrenamiento() {
		System.out.println("Planificar un Entrenamiento");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getTitulacion() {
		return Titulacion;
	}

	public void setTitulacion(String titulacion) {
		Titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "Entrenador [id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad
				+ ", Titulacion=" + Titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
	}

}
