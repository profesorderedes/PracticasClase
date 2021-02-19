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

}
