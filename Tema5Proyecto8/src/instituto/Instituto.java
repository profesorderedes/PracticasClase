package instituto;

import auxiliar.Alumno;

public class Instituto {
	
	private final int MAX_ALUMNOS = 1000;
	
	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];
	
	// Añade un alumno al array.
	public void addAlumno(Alumno alu) {
		
		for (int i = 0; i < alumnos.length; i++) {
			
			// Comprobamos si la posición está vacía.
			if(alumnos[i] == null) {
				
				// Guardamos alu en esa posición vacía.
				alumnos[i] = alu;
				break;
				
			}
			
		}
		
	}
	
	// Muestra una lista con todos los alumnos matriculados.
	public void muestraAlumnos() {
		
		System.out.println("LISTADO DE ALUMNOS");
		System.out.println("===================================");
		for (int i = 0; i < alumnos.length; i++) {
			
			// Si alumnos[i] fuera null, nos daría NullPointerException.
			if(alumnos[i] != null) {
				System.out.println(alumnos[i].toString());
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
