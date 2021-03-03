package piezas;

import interfaces.ITablero;
import tablero.Casilla;
import tablero.Posicion;

public abstract class Barco {
	
	private static final int DIRECCION_NORTE = 0;
	private static final int DIRECCION_ESTE = 1;
	private static final int DIRECCION_SUR = 2;
	private static final int DIRECCION_OESTE = 3;
	
	private String nombre;
	protected int tamanyo;
	
    protected Casilla[] posicionesOcupadas;
    
    private ITablero iTablero;
    
    public Barco(ITablero iTablero) {
    	this.iTablero = iTablero;
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String getSigla();

	public abstract void iniciarCaracteristicasBarco();
    
    //public abstract void situarBarcoEnTablero();
	//public abstract boolean comprobarEstadoCasillas(Casilla casillaInicial, int direccion, int tamanyo);
	
	public boolean isBarcoTocado() {
		boolean tocado = false;
    	for (int i = 0; i < posicionesOcupadas.length; i++) {
    		if (posicionesOcupadas[0].isTocado()) {
    			tocado = true;
    			break;
    		}
    	}
    	return tocado;
    }
    
    public boolean isBarcoHundido() {
    	boolean hundido = true;
    	for (int i = 0; i < posicionesOcupadas.length; i++) {
    		hundido = hundido && posicionesOcupadas[i].isTocado();
    		if (!hundido) {
    			break;
    		}
    	}
    	return hundido;
    }
    
    private int getRandomValue(int valorMaximo) {
    	return (int)(Math.random() * valorMaximo);
    }
    
	protected void situarBarcoEnTablero() {
		boolean resultado = false;
		while (!resultado) {
			//Generamos valores aleatorios para colocar el barco
			//El random va de X >= 0 a X < 1
			//Si lo multiplicamos por 10, y lo "casteamos" a entero, nos dará valores de 0 a 9
			int filaInicial = getRandomValue(iTablero.getTamanyoTablero());
			int columnaInicial = getRandomValue(iTablero.getTamanyoTablero());
			
			//De igual forma con la dirección, si lo multiplicamos por 4, nos dará valores entre 0 y 4
			//La correspondencia de dirección es: 0 (NORTE), 1 (ESTE), 2 (SUR), 3 (OESTE)
			int direccion = getRandomValue(4); 
			
			Posicion inicial = new Posicion(filaInicial, columnaInicial);
			Casilla casilla = iTablero.leerCasilla(inicial);
			
			//Si la casilla es correcta (no está fuera de rangos)
			//Si no era correcta, buscremos otra
			if (casilla != null) {
				
				//Iniciamos el proceso de comprobación de casillas (para saber si están vacias u ocupadas)
				resultado = comprobarEstadoCasillas(casilla, direccion, tamanyo);
				
				//En este caso, saldremos del bucle.
				//Si se nos ha retornado un valor true, quiere decir que las casillas son válidas
				
				//si (resultado == true) --> A su vez, ya las hemos vinculado, así que no habría nada más que hacer
				//si (resultado == false) --> En este caso, como no hemos podido colocar el barco, seguiremos en el bucle
				
			}
		}
		
		System.out.println("* " + getNombre() + " situado en tablero");
		
	}

	public boolean comprobarEstadoCasillas(Casilla casillaActual, int direccion, int tamanyo) {
		boolean barcoOK = false;
		
		//Si hemos comprobado todas las casillas, quiere decir que el barco puede ponerse
		if (tamanyo == 0) {
			barcoOK = true;
			
		} else {
			
			//Si la casilla está ocupada previamente, no se podrá colocar el barco
			//Además de lo anterior, si las casillas adyacentes a la posición ya están ocupadas, tampoco se podrá
			//Este método debe devolver falso
			if (casillaActual.isOcupado() || comprobarEstadoOcupadoCasillasAdyacentes(casillaActual)) {
				return barcoOK;
				
			} else {
				//Cogemos el valor de la posicion actual que nos llega por parámetro
				Posicion proximaPosicion = new Posicion(casillaActual.getFila(), casillaActual.getColumna());
				
				//El valor de la dirección (norte/este/sur/oeste) también nos llega por parámetro
				
				// El valor de dirección 3 es OESTE, por lo que deberemos mirar la columna anterior (la de la izquierda)
				// El valor de la fila será la misma que la actual
				if (direccion == DIRECCION_OESTE) {
					proximaPosicion.setColumna(proximaPosicion.getColumna() - 1);
					
				// El valor de dirección 1 es ESTE, por lo que deberemos mirar la columna siguiente (la de la derecha)
				// El valor de la fila será la misma que la actual
				} else if (direccion == DIRECCION_ESTE) {
					proximaPosicion.setColumna(proximaPosicion.getColumna() + 1);
				
				// El valor de dirección 2 es SUR, por lo que deberemos mirar la fila posterior (la de abajo)
				// El valor de la columna será la misma que la actual
				} else if (direccion == DIRECCION_SUR) {
					proximaPosicion.setFila(proximaPosicion.getFila() + 1);
					
				// El valor de dirección 0 (o cualquier otra) es NORTE, por lo que deberemos mirar la fila anterior (la de arriba)
				// El valor de la columna será la misma que la actual
				} else {
					proximaPosicion.setFila(proximaPosicion.getFila() - 1);
				}
				
				//Comprobamos si el valor de la nueva casilla es correcto (está dentro del tablero)
				Casilla proximaCasilla = iTablero.leerCasilla(proximaPosicion);
				if (proximaCasilla != null) {
					
					//OJO!!
					//Nos llamamos a "nosotros mismos", para comprobar la validez de la siguiente casilla
					//A esto se le llama RECURSIVIDAD
					barcoOK = comprobarEstadoCasillas(proximaCasilla, direccion, tamanyo - 1);
					
					if (barcoOK) {
						casillaActual.setEstadoActual(Casilla.TipoEstado.ESTADO_OCUPADO);
						casillaActual.setBarco(this);
						iTablero.modificarCasilla(casillaActual);
						
						//Guardamos las casillas en orden inverso al de la recursividad (para guardarlos en orden)
						int indicePosicion = posicionesOcupadas.length - tamanyo;
						this.posicionesOcupadas[indicePosicion] = casillaActual;
					}	
					
				} else {
					//La casilla estaría fuera de los márgenes del tablero, por lo que el barco no se puede colocar
					//En este caso, el valor de barcoOk sería false y se buscarían otros valores
				}
				
			}
		}
		return barcoOK;
	}
	
	private boolean comprobarEstadoOcupadoCasillasAdyacentes(Casilla casilla) {
		Casilla[] adyacentes = iTablero.getCasillasAdyacentes(casilla);
		if (adyacentes == null) {
			return false;
		}
		
		boolean casillasAdyacentesOcupadas = false;
		for (int i = 0; i < adyacentes.length; i++) {
			if (adyacentes[i].isOcupado()) {
				casillasAdyacentesOcupadas = true;
				break;
			}
		}
		
		return casillasAdyacentesOcupadas;
	}


}
