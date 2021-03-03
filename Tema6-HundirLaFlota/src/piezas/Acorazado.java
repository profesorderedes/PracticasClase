package piezas;

import interfaces.ITablero;
import tablero.Casilla;

public class Acorazado extends Barco {
	
	public Acorazado(ITablero iTablero) {
		super(iTablero);
    	setNombre("Acorazado");
    }

	@Override
	public void iniciarCaracteristicasBarco() {
		this.tamanyo = 3;
		this.posicionesOcupadas = new Casilla[tamanyo];
	}

	@Override
	public String getSigla() {
		return "A";
	}
	
	@Override
	public void situarBarcoEnTablero() {
		super.situarBarcoEnTablero();
	}
	
}
