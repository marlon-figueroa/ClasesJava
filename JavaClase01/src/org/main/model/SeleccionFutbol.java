package org.main.model;

public abstract class SeleccionFutbol {

	protected int id;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;

	public SeleccionFutbol() {
		// TODO Auto-generated constructor stub
	}

	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		super();
		this.id = id;
		Nombre = nombre;
		Apellidos = apellidos;
		Edad = edad;
	}

	public void viajar() {
		System.out.println("Viajar (Clase Padre)");
	}

	public void concentrarse() {
		System.out.println("Concentrarse (Clase Padre)");
	}

	// IMPORTANTE -> METODO ABSTRACTO => no se implementa en la clase abstracta pero si en la clases hijas
	public abstract void entrenamiento();

	public void partidoFutbol() {
		System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
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

	@Override
	public String toString() {
		return "SeleccionFutbol [id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + "]";
	}

}
