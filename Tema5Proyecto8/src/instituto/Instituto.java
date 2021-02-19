package instituto;

import auxiliar.Alumno;

public class Instituto {

	private final int MAX_ALUMNOS = 1000;

	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];

	// Añade un alumno al array.
	public void addAlumno(Alumno alu) {

		for (int i = 0; i < alumnos.length; i++) {

			// Comprobamos si la posición está vacía.
			if (alumnos[i] == null) {

				// Guardamos alu en esa posición vacía.
				alumnos[i] = alu;
				break;

			}

		}

	}

	// Borra de la lista el alumno cuyo número de expediente se pasa.
	public void delAlumno(int numExpediente) {

		for (int i = 0; i < alumnos.length; i++) {

			// Compruebo si el alumno en la posición i tiene
			// el número de expediente que me acaban de pasar.
			// También compruebo antes que alumnos[i] no sea null, para
			// evitar un NullPointerException.
			if (alumnos[i] != null && 
					alumnos[i].getNumExpediente() == numExpediente) {

				alumnos[i] = null;
				break;

			}

		}

	}

	// Muestra una lista con todos los alumnos matriculados.
	public void muestraAlumnos() {

		System.out.println("\nLISTADO DE ALUMNOS");
		System.out.println("===================================");
		for (int i = 0; i < alumnos.length; i++) {

			// Si alumnos[i] fuera null, nos daría NullPointerException.
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toString());
			}

		}

	}
	
	public int numAlumnos() {
		
		int numAlumnos = 0;
		
		// Recorremos el array
		for (int i = 0; i < alumnos.length; i++) {
			
			if(alumnos[i] != null) {
				numAlumnos++;
			}
			
		}
		
		return numAlumnos;
		
	}
	
	public int buscaAlumno(int numExp) {
		
		for (int i = 0; i < alumnos.length; i++) {
			
			
			
		}
		
	}

}



















