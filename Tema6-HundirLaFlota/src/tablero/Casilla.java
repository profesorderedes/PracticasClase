package tablero;

import piezas.Barco;

public class Casilla extends Posicion {
	
	public enum TipoEstado {
		SIN_ESTADO, ESTADO_AGUA, ESTADO_OCUPADO, ESTADO_TOCADO
	}
	private TipoEstado estadoActual;
	
	private Barco barco;
	
	public Casilla(int fila, int columna) {
		super(fila, columna);
		this.estadoActual = TipoEstado.SIN_ESTADO;
	}

	public TipoEstado getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(TipoEstado estadoActual) {
		this.estadoActual = estadoActual;
	}
	
	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}
	
	public boolean isNoEstado() {
		return TipoEstado.SIN_ESTADO.equals(estadoActual) &&
				getBarco() == null;
	}

	public boolean isAgua() {
		return TipoEstado.ESTADO_AGUA.equals(estadoActual) && 
				getBarco() == null;
	}
	
	public boolean isTocado() {
		return TipoEstado.ESTADO_TOCADO.equals(estadoActual) &&
				getBarco() != null;
	}
	
	public boolean isOcupado() {
		return TipoEstado.ESTADO_OCUPADO.equals(estadoActual) &&
				getBarco() != null;
	}
	
	public boolean isBarcoHundido() {
		return getBarco() != null && getBarco().isBarcoHundido();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof Casilla) {
			return getFila() == ((Casilla) obj).getFila() && 
					getColumna() == ((Casilla) obj).getColumna();
		}
		return false;
	}
}
