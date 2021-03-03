package interfaces;

import tablero.Casilla;
import tablero.Posicion;

public interface IJugador {

	public Posicion convertirFilaColumnaAPosicion(String fila, String columna);
	public Posicion convertirFilaColumnaAPosicion(String filaColumna);
	
	public Casilla getCasillaJugadorOponente(Posicion posicion);
	
}
