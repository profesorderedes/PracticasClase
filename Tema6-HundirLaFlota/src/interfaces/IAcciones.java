package interfaces;

import jugador.Jugador;
import tablero.Posicion;

public interface IAcciones {
	
	public Jugador decidirQuienEmpieza();
	public Jugador cambiarTurnoJugador();
	
	public int mostrarMenuOpcionesJugador(Jugador jugador);
	public void verTableroDeAtaques(Jugador jugador);
	public void verTableroJugador(Jugador jugador);
	public Posicion obtenerPosicionAtaqueJugador(IEntradaDatos iEntradaDatos, Jugador jugador);
	
	public boolean definirAtaqueJugador(Posicion posicion, Jugador jugador, Jugador jugadorContrario);
	public boolean esJugadorActualGanador(Jugador jugadorContrario);
	
	
	
	

}
