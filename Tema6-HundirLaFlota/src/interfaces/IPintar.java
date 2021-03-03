package interfaces;

import tablero.Casilla;

public interface IPintar {
	
	public void pintarEstadoCasilla(Casilla casilla);
	public void mostrarEstadoActualTablero();
	
	public void mostrarResultadoAtaque(Casilla casilla);

}
