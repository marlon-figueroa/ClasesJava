package org.main.model;

public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		// TODO Auto-generated constructor stub
	}

	public Futbolista(int id, String nombre, String apellidos, int dorsal, int edad, String desmarcacion) {
		this.setId(id);
		this.setDorsal(dorsal);
		this.setEdad(edad);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setDemarcacion(desmarcacion);
	}

	@Override
	public void entrenamiento() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	@Override
	public void partidoFutbol() {
		System.out.println("Juega un Partido (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
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

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public String toString() {
		return "Futbolista [id=" + id + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad
				+ ", dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
	}

}
