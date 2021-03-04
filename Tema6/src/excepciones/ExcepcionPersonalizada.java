package excepciones;

public class ExcepcionPersonalizada {
	
	public static void main(String[] args) {
		
		String[] elementos = new String[3];
		for (int i = 0; i < elementos.length; i++) {
			try {
			
				if (contieneValorNull(elementos[i])) {
					System.out.println("La posición " + i + "está vacía");
				}
			} catch (MiExcepcion e) {
				System.out.println("Ha saltado Mi excepcion");
				e.printStackTrace();
				
			} finally {
				//Código a realizar sí o sí al finalizar el contenido del try
				//Tanto si salta una excepcion como si no
			}
		}
		
	}
	
	private static boolean contieneValorNull(String valor) throws MiExcepcion {
		if (valor == null) {
			throw new MiExcepcion();
		}
		
		return valor.contains("null");
	}

}
