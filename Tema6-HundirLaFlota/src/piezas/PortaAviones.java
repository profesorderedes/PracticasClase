package piezas;

import interfaces.ITablero;
import tablero.Casilla;

public class PortaAviones extends Barco {
	
	public PortaAviones(ITablero iTablero) {
		super(iTablero);
    	setNombre("Portaaviones");
    }

	@Override
	public void iniciarCaracteristicasBarco() {
		this.tamanyo = 4;
		this.posicionesOcupadas = new Casilla[tamanyo];
	}

	@Override
	public String getSigla() {
		return "P";
	}
	
	@Override
	public void situarBarcoEnTablero() {
		super.situarBarcoEnTablero();
	}

}
