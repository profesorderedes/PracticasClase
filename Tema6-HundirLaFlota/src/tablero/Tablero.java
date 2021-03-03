package tablero;

import java.util.Arrays;

import interfaces.IPintar;
import interfaces.ITablero;
import utils.CasillaUtils;

public class Tablero implements ITablero, IPintar {
	
	private static final int TAMANYO_TABLERO = 10;
	
	private static final String[] FILAS = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	private static final String[] COLUMNAS = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
	
	private Casilla[][] tablero;
	
	public Tablero() {
		iniciarTablero();
	}
	
	private boolean isPosicionCorrecta(Posicion posicion) {
		if (posicion == null) {
			return false;
		}
		
		return (posicion.getFila() >= 0 && posicion.getFila() < TAMANYO_TABLERO) &&
				(posicion.getColumna() >= 0 && posicion.getColumna() < TAMANYO_TABLERO);
		
	}

	public void iniciarTablero() {
		tablero = new Casilla[TAMANYO_TABLERO][TAMANYO_TABLERO];
		
		for (int i = 0; i < TAMANYO_TABLERO; i++) {
			for (int j = 0; j < TAMANYO_TABLERO; j++) {
				tablero[i][j] = new Casilla(i, j);
			}
		}
	}

	@Override
	public boolean modificarCasilla(Casilla casilla) {
		if (!isPosicionCorrecta(casilla)){
			return false;
		}
		
		tablero[casilla.getFila()][casilla.getColumna()] = casilla;
		return true;
	}

	@Override
	public Casilla leerCasilla(Posicion posicion) {
		if (posicion == null || !isPosicionCorrecta(posicion)) {
			return null;
		}
		
		return tablero[posicion.getFila()][posicion.getColumna()];
	}
	
	@Override
	public void pintarEstadoCasilla(Casilla casilla) {
		if (casilla.isTocado()) {
			System.out.print(CasillaUtils.pintarCasilla("X"));
		} else if (casilla.isOcupado()) {
			String sigla = casilla.getBarco().getSigla();
			System.out.print(CasillaUtils.pintarCasilla(sigla));
		} else if (casilla.isAgua()) {
			System.out.print(CasillaUtils.pintarCasilla("~"));
		} else {
			System.out.print(CasillaUtils.pintarCasilla("·"));
		}
	}
	
	private void pintarIndiceFila(int fila) {
		if (fila == -1) {
			System.out.print(CasillaUtils.pintarCasilla("  "));
		} else {
			System.out.print(CasillaUtils.pintarLeyendaFila(FILAS[fila]));
		}
	}
	
	private void pintarIndiceColumna(int columna) {
		System.out.print(CasillaUtils.pintarLeyendaColumna(COLUMNAS[columna]));
	}

	@Override
	public void mostrarEstadoActualTablero() {
		System.out.println("|-----------------------------------|");
		System.out.println("|------ ESTADO ACTUAL TABLERO ------|");
		System.out.println("|-----------------------------------|");
		for (int i = -1; i < TAMANYO_TABLERO; i++) {
			pintarIndiceFila(i);
			
			for (int j = 0; j < TAMANYO_TABLERO; j++) {
				if (i == -1) {
					pintarIndiceColumna(j);
				} else {
					pintarEstadoCasilla(tablero[i][j]);
				}
			}
			
			System.out.println("");
		}
	}

	@Override
	public void mostrarResultadoAtaque(Casilla casilla) {
		System.out.println("|-----------------------------------|");
		System.out.println("Ataque en 3, 2, 1 ...");
		if (casilla.isTocado() && 
				casilla.isBarcoHundido()) {
			System.out.println("¡TOCADO Y HUNDIDO!");
		} else if (casilla.isTocado()) {
			System.out.println("¡TOCADO!");
		} else if (casilla.isAgua()) {
			System.out.println("¡AGUA!");
		}
		System.out.println("|-----------------------------------|");
	}

	@Override
	public int getTamanyoTablero() {
		return TAMANYO_TABLERO;
	}
	
	@Override
	public Casilla[] getCasillasAdyacentes(Casilla casilla) {
		if (casilla == null) {
			return null;
		}
		
		Casilla[] casillasAdyacentes = null;
		
		//Obtener posición casill actual
		int filaActual = casilla.getFila();
		int columnaActual = casilla.getColumna();
		
		//Comprobar si la fila está en alguno de los límites del tablero
		boolean limiteFila = false;
		if (filaActual == 0 || filaActual == getTamanyoTablero() - 1) {
			limiteFila = true;
		}
		
		//Comprobar si la fila está en alguno de los límites del tablero
		boolean limiteColumna = false;
		if (columnaActual == 0 || columnaActual == getTamanyoTablero() - 1) {
			limiteColumna = true;
		}
		
		if (limiteFila && limiteColumna) {
			//Posiciones 1A, 1J, 10A o 10J
			casillasAdyacentes = new Casilla[3];
		} else if (limiteFila || limiteColumna) {
			//Posiciones 1x, 10x, xA o xJ 
			casillasAdyacentes = new Casilla[5];
		} else {
			//Cualquier otra posición del tablero
			casillasAdyacentes = new Casilla[8];
		}
		
		casillasAdyacentes = obtenerCasillas(casillasAdyacentes, filaActual, columnaActual, getTamanyoTablero());
		return casillasAdyacentes;
	}
	
	private Casilla[] obtenerCasillas(Casilla[] casillasAdyacentes, int fila, int columna, int tamanyo) {
		
		int indiceCasillas = 0;
		
		//     [ -1][  0][ +1]
		//[ -1][   ][   ][   ]
		//[  0][   ][f/c][   ]	
		//[ +1][   ][   ][   ]	
		//
		
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				
				//Si las filas/columnas estan fuera del tablero, las debemos saltar
				//Este "salto" se hace con la instrucción <<continue>>
				//También la fila/columna central (es decir, la casilla actual), no se debe añadir
				//En este doble for, la casilla actual sería la i == 0 y la j == 0
				
				if ((i == 0 && j == 0) ||
						fila + i < 0 || 
						fila + i > tamanyo - 1 ||
						columna + j < 0 || 
						columna + j > tamanyo - 1) {
					continue;
				}
				
				if (indiceCasillas < casillasAdyacentes.length) {
					Posicion posicion = new Posicion(fila + i, columna + j);
					casillasAdyacentes[indiceCasillas] = leerCasilla(posicion);
					
					indiceCasillas++;
				}
			}
		}
		return casillasAdyacentes;
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 */


	public static Posicion convertirFilaColumnaAPosicion(String fila, String columna) {
		Posicion posicion = null;
		if (Arrays.asList(FILAS).contains(fila) && 
				Arrays.asList(COLUMNAS).contains(columna)) {
			
			int fil = Arrays.asList(FILAS).indexOf(fila);
			int col = Arrays.asList(COLUMNAS).indexOf(columna);
			posicion = new Posicion(fil, col);
			
		}
		return posicion;
	}
	
	public static Posicion convertirFilaColumnaAPosicion(String filaColumna) {
		if (filaColumna == null || filaColumna.length() < 2 || filaColumna.length() > 3) {
			return null;
		}
		
		String fila = (filaColumna.length() == 3) ? filaColumna.substring(0, 2) : filaColumna.substring(0, 1); 
		String columna = (filaColumna.length() == 3) ? filaColumna.substring(2, 3) : filaColumna.substring(1, 2);
		
		return convertirFilaColumnaAPosicion(fila, columna);
	}

	@Override
	public String[] getFilasTablero() {
		return FILAS;
	}

	@Override
	public String[] getColumnasTablero() {
		return COLUMNAS;
	}
}
	

