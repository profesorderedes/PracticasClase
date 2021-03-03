package piezas;

import interfaces.ITablero;
import tablero.Casilla;

public class Destructor extends Barco {
	
	public Destructor(ITablero iTablero) {
		super(iTablero);
		setNombre("Destructor");
    }

	@Override
	public void iniciarCaracteristicasBarco() {
		this.tamanyo = 2;
		this.posicionesOcupadas = new Casilla[tamanyo];
	}
	
	@Override
	public String getSigla() {
		return "D";
	}
	
	@Override
	public void situarBarcoEnTablero() {
		super.situarBarcoEnTablero();
	}

}
