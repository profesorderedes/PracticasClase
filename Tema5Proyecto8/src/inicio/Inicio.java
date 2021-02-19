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

//		System.out.println(alu1.toString());

		Alumno alu2 = new Alumno();

//		alu2.leeDatos();
//		System.out.println(alu2.toString());

		Instituto iessonferrer = new Instituto();
		iessonferrer.addAlumno(alu1);
		
		iessonferrer.muestraAlumnos();

	}

}
