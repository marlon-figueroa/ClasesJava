package org.main.model;

public class Masajista extends SeleccionFutbol {

	private String titulacion;
	private int idFederacion;

	public Masajista() {
		// TODO Auto-generated constructor stub
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int idFederacion) {
		this.setId(id);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setIdFederacion(idFederacion);
		this.setEdad(edad);
		this.setTitulacion(titulacion);
	}

	@Override
	public void entrenamiento() {
		System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	}

	public void darMasaje() {
		System.out.println("Da un Masaje");
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public String toString() {
		return "Masajista [titulacion=" + titulacion + ", idFederacion=" + idFederacion + "]";
	}

}
