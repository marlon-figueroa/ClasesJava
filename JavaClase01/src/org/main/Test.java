package org.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

import org.main.model.Entrenador;
import org.main.model.Futbolista;
import org.main.model.Masajista;
import org.main.model.SeleccionFutbol;

public class Test {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		
//		Por linea
//		SeleccionFutbol sf01 = new Masajista();
//		sf01.setId(UUID.randomUUID().hashCode());
//		sf01.setNombre("Marian Carolina");
//		sf01.setApellidos("Robin Seins");
//		sf01.setEdad(LocalDate.now().getYear() - 1995);
//		System.out.println(sf01.toString());
		
		/* En bloque
			SeleccionFutbol sf01 = new Masajista();
			sf01.setId(UUID.randomUUID().hashCode());
			sf01.setNombre("Marian Carolina");
			sf01.setApellidos("Robin Seins");
			sf01.setEdad(LocalDate.now().getYear() - 1995);
			System.out.println(sf01.toString());
		*/
		
		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)\n");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(String.format("\t%s %s %s", integrante.getNombre(), integrante.getApellidos(), " -> "));
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)\n");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(String.format("\t%s %s %s", integrante.getNombre(), integrante.getApellidos()," -> "));
			integrante.viajar();
		}
		
	}

}
