package utils;

public class CasillaUtils {
	
	public static final String pintarCasilla(String valor) {
		return "[" + valor + "]";
	}
	
	public static final String pintarLeyendaFila(String fila) {
		int valor = Integer.valueOf(fila);
		return pintarLeyendaFila(valor);
	}
	
	public static final String pintarLeyendaFila(int valor) {
		String posicionStr = String.valueOf(valor);
		if (valor < 10) {
			return pintarCasilla(" " + posicionStr);
		} else {
			return pintarCasilla(posicionStr);
		}
	}
	
	public static final String pintarLeyendaColumna(String columna) {
		return pintarCasilla(columna);
	}

}
