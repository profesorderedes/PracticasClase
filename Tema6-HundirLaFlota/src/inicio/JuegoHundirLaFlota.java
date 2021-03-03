package inicio;

import java.util.Scanner;

import interfaces.IAcciones;
import interfaces.IEntradaDatos;
import jugador.Jugador;
import tablero.Posicion;

public class JuegoHundirLaFlota implements IEntradaDatos, IAcciones {
	
	private static final int MAX_MOVIMIENTOS_PARTIDA = 1000;
	
	private static final int OPCION_MOSTRAR_MI_TABLERO = 1;
	private static final int OPCION_MOSTRAR_TABLERO_CONTRARIO = 2;
	private static final int OPCION_ATACAR = 3;
	
	private static final int NUM_JUGADORES = 2;
	private Jugador[] jugadores;
	
	private Jugador jugadorActual;
	private int indiceJugadorActual;
	
	private boolean hayGanador = false;
	private Scanner scanner;
	
	public JuegoHundirLaFlota(){
		System.out.println("|-------------------------------|");
		System.out.println("| BIENVENIDO AL HUNDIR LA FLOTA |");
		System.out.println("|-------------------------------|");
		
		iniciarLectorDeDatos();
	}
	
	public void prepararJugadores() {
		jugadores = new Jugador[2];
		
		for (int i = 0; i < NUM_JUGADORES; i++) {
			Jugador jugador = new Jugador(this);
			jugador.identificarJugador();
			jugador.situarFlotaEnTablero();
			
			jugadores[i] = jugador;
		}
	}

	private Jugador getJugador(int indiceJugadorActual) {
		return jugadores[indiceJugadorActual];
	}
	
	public void jugar() {
		System.out.println("|-------------------------------|");
		System.out.println("|----- SELECCION DE JUGADOR ----|");
		System.out.println("|-------------------------------|");
		
		jugadorActual = decidirQuienEmpieza();
		System.out.println("|-------------------------------|");
		System.out.println("| " + jugadorActual.getNombre() + " iniciará la partida");
		System.out.println("|-------------------------------|");
		
		int numeroDisparos = 1;
		while (!hayGanador || numeroDisparos == MAX_MOVIMIENTOS_PARTIDA) {
			int opcion = mostrarMenuOpcionesJugador(jugadorActual);
			numeroDisparos = ejecutarOpcion(opcion, numeroDisparos);
		}
	}
	
	private int ejecutarOpcion(int opcion, int numeroDisparos) {
		switch (opcion) {
			case OPCION_MOSTRAR_TABLERO_CONTRARIO:
				verTableroDeAtaques(jugadorActual);
				break;
				
			case OPCION_MOSTRAR_MI_TABLERO:
				verTableroJugador(jugadorActual);
				break;
				
			case OPCION_ATACAR:
				Posicion posicionAAtacar = leerPosicion(jugadorActual);
				if (posicionAAtacar != null) {
					boolean tocado = procesarAtaque(posicionAAtacar, jugadorActual);
					if (tocado) {
						//Si hay acierto, se comprueba si hay ganador
						hayGanador = esJugadorActualGanador(getJugadorOponente());
					} else {
						//Si no hay acierto, no se cambia al jugador
						jugadorActual = cambiarTurnoJugador();
					}
				}
				
				numeroDisparos++;
				break;
	
			default:
				break;
		}
		return numeroDisparos;
	}
	
	private Posicion leerPosicion(Jugador jugador) {
		Posicion posicionAAtacar = obtenerPosicionAtaqueJugador(this, jugador);
		if (posicionAAtacar == null) {
			mostrarError();
		}
		return posicionAAtacar;
	}
	
	private boolean procesarAtaque(Posicion posicionAAtacar, Jugador jugador) {
		return definirAtaqueJugador(posicionAAtacar, jugador, getJugadorOponente());
	}
	
	public void mostrarGanador() {
		System.out.println("|-------------------------------|");
		System.out.println("| ¡" + jugadorActual.getNombre() + " HA GANADO!");
		System.out.println("|-------------------------------|");
		
		cerrarLectorDeDatos();
	}
	
	private void mostrarTurnoJugador(Jugador jugador) {
		System.out.println("|-------------------------------|");
		System.out.println("|TURNO DE " + jugador.getNombre());
		System.out.println("|-------------------------------|");
	}
	
	
	@Override
	public Jugador decidirQuienEmpieza(){
		double azar = Math.random();
		double valor = 1 / (double)NUM_JUGADORES;
		
		if (azar >= valor) {
			indiceJugadorActual = 1;
		} else {
			indiceJugadorActual = 0;
		}
		return getJugador(indiceJugadorActual);
	}
	
	@Override
	public Jugador cambiarTurnoJugador() {
		indiceJugadorActual = getIndiceProximoJugador(indiceJugadorActual);
		return getJugador(indiceJugadorActual);
	}
	
	private int getIndiceProximoJugador(int indiceJugadorActual) {
		if (indiceJugadorActual == NUM_JUGADORES - 1) {
			return 0;
		} else {
			return indiceJugadorActual + 1;
		}
	}
	
	public Jugador getJugadorOponente() {
		return getJugador(getIndiceProximoJugador(indiceJugadorActual));
	}

	@Override
	public boolean definirAtaqueJugador(Posicion posicion, Jugador jugador, Jugador jugadorContrario) {
		return jugador.realizarAtaque(posicion, jugadorContrario);
	}
	
	@Override
	public Posicion obtenerPosicionAtaqueJugador(IEntradaDatos iEntradaDatos, Jugador jugador) {
		System.out.println("|-------------------------------|");
		System.out.println("|  Introduzca casilla a atacar  |");
		System.out.println("|-------------------------------|");
		
		//Opción 1: Fila y columna por separado//
		/*System.out.println("Fila [1..10]: ");
		String fila = leerDatoString();
		System.out.println("Columna [A..J]: ");
		String columna = leerDatoString();
		return jugador.convertirFilaColumnaAPosicion(fila, columna);*/
		
		//Opción 2: Fila y columna en el mismo string (formato "F" + "C")
		System.out.println("| FORMATO FC (p.e. 1A, 5I o 10J |");
		System.out.println("|-------------------------------|");
		String filaColumna = iEntradaDatos.leerDatoString();
		return jugador.convertirFilaColumnaAPosicion(filaColumna);
	}

	
	@Override
	public boolean esJugadorActualGanador(Jugador jugadorContrario) {
		return jugadorContrario.isFlotaHundida();
	}

	@Override
	public int mostrarMenuOpcionesJugador(Jugador jugador) {
		mostrarTurnoJugador(jugador);
		
		System.out.println("|-------------------------------|");
		System.out.println("|----------- OPCIONES ----------|");
		System.out.println("|-------------------------------|");
		System.out.println("| " + OPCION_MOSTRAR_MI_TABLERO + " --> Ver mi tablero          |");
		System.out.println("| " + OPCION_MOSTRAR_TABLERO_CONTRARIO + " --> Ver tablero contrario   |");
		System.out.println("| " + OPCION_ATACAR + " --> Atacar                  |");
		System.out.println("|-------------------------------|");
		System.out.println("Escribe opción: ");
		
		try {
			String valorOpcion = leerDatoString();
			int opcion = Integer.valueOf(valorOpcion);
			
			if (opcion == OPCION_MOSTRAR_MI_TABLERO ||
					opcion == OPCION_MOSTRAR_TABLERO_CONTRARIO ||
					opcion == OPCION_ATACAR) {
				return opcion;
			}
			
		} catch(NumberFormatException e) {
			
		}

		mostrarError();
		return mostrarMenuOpcionesJugador(jugador);
		
	}
	
	private void mostrarError() {
		System.out.println("|----------- ¡ERROR! -----------|");
		System.out.println("|------ OPCIÓN INCORRECTA ------|");
		System.out.println("|-------------------------------|");
	}

	@Override
	public void verTableroDeAtaques(Jugador jugador) {
		jugador.verTableroAtaques();
	}

	@Override
	public void verTableroJugador(Jugador jugador) {
		jugador.verTableroPropio();
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	

	@Override
	public void iniciarLectorDeDatos() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
	}

	@Override
	public String leerDatoString() {
		return scanner.nextLine();
	}

	@Override
	public int leerDatoInt() {
		int valor = scanner.nextInt();
		leerDatoString();
		return valor;
	}

	@Override
	public void cerrarLectorDeDatos() {
		if (scanner != null) {
			scanner.close();
		}
	}

}
