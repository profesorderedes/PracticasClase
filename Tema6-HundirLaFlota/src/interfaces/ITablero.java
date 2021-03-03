package interfaces;

import tablero.Casilla;
import tablero.Posicion;

public interface ITablero {

	public int getTamanyoTablero();
	public String[] getFilasTablero();
	public String[] getColumnasTablero();
	
	public boolean modificarCasilla(Casilla casilla);
	public Casilla leerCasilla(Posicion posicion);
	
	public Casilla[] getCasillasAdyacentes(Casilla casilla);
	
}
