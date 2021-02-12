package inicio;

import biblioteca.Autor;

public class Inicio {

	public static void main(String[] args) {

		Autor autor1 = new Autor("Manuel", "manuel@gmail.com", 1970);
		System.out.println(autor1);
		
		/*
		autor1.setFechaNacimiento(1989);
		System.out.println(autor1);
*/
		// Autor autor2= new Autor("Maria");
		// autor2.mostrarString("Datos completos del registro 2: ");
		// System.out.println(autor2);
		// autor2.mostrarString("Recuerda, puedes entrar en contacto "
		// + "con el autor a través: "+autor2.getEmail());
	}

}
