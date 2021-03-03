package piezas;

import interfaces.ITablero;
import tablero.Casilla;

public class Fragata extends Barco {
	
	public Fragata(ITablero iTablero) {
		super(iTablero);
		setNombre("Fragata");
    }

	@Override
	public void iniciarCaracteristicasBarco() {
		this.tamanyo = 1;
		this.posicionesOcupadas = new Casilla[tamanyo];
		
	}
	
	@Override
	public String getSigla() {
		return "F";
	}
	
	@Override
	public void situarBarcoEnTablero() {
		super.situarBarcoEnTablero();
	}

}
