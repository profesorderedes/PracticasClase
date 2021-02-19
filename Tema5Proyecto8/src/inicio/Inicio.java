package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {

//		Grupo grupo1 = new Grupo();
//		grupo1.leeDatos();
//		System.out.println(grupo1.toString());

		Grupo grupo1 = new Grupo(1, "ESO", 3, "C");
		Alumno alu1 = new Alumno(990, "Martínez López", "Manuel", grupo1);
		Alumno alu2 = new Alumno(991, "Pérez Fernández", "Fernando", grupo1);
		Alumno alu3 = new Alumno(992, "López Asís", "Francisco", grupo1);

//		System.out.println(alu1.toString());

//		alu2.leeDatos();
//		System.out.println(alu2.toString());

		// Creamos un objeto Instituto para los datos del IES Son Ferrer.
		Instituto iessonferrer = new Instituto();
		
		// Matriculamos (añadimos) a tres alumnos para hacer pruebas.
		iessonferrer.addAlumno(alu1);
		iessonferrer.addAlumno(alu2);
		iessonferrer.addAlumno(alu3);
		
		// Vemos el listado de alumnos.
		iessonferrer.muestraAlumnos();
		
		// Eliminamos al alumno cuyo número de expediente es 990.
		iessonferrer.delAlumno(990);
		
		// Vemos otra vez el listado de alumnos.
		iessonferrer.muestraAlumnos();
		
		// Averiguamos cuántos alumnos hay en el instituto.
		int numeroDeAlumnos = iessonferrer.numAlumnos();
		
		// Mostramos cuántos alumnos hay en el instituto.
		System.out.println("El número de alumnos es " + numeroDeAlumnos);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
