package excepciones;

public class Excepcion {
	
	public static void main(String[] args) {
		
		String[] elementos = new String[3];
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i].contains("null")) {
				System.out.println("La posición " + i + "está vacía");
			}
		}
		
	}

}
