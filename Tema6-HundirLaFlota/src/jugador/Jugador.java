package jugador;

import java.util.ArrayList;

import interfaces.IEntradaDatos;
import interfaces.IJugador;
import piezas.Acorazado;
import piezas.Barco;
import piezas.Destructor;
import piezas.Fragata;
import piezas.PortaAviones;
import tablero.Casilla;
import tablero.Posicion;
import tablero.Tablero;

public class Jugador implements IJugador {
	
	private static final int MAX_BARCOS = 10;
	
	private IEntradaDatos iEntradaDatos;
	
	private String nombre;
	private Tablero miTablero;
	private Tablero tableroAtacante;
	
	private ArrayList<Barco> flota;
	private ArrayList<Casilla> ataques;
	
	public Jugador(IEntradaDatos iEntradaDatos) {
		this.iEntradaDatos = iEntradaDatos;
		
		this.miTablero = new Tablero();
		this.tableroAtacante = new Tablero();
		this.ataques = new ArrayList<Casilla>();
		
		definirFlota();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void identificarJugador() {
		System.out.println("|-------------------------------|");
		System.out.println("| Nombre del jugador            |");
		this.nombre = iEntradaDatos.leerDatoString();
	}
	
	private void definirFlota() {
		flota = new ArrayList<Barco>();
	}
	
	public void situarFlotaEnTablero() {
		System.out.println("|-------------------------------|");
		System.out.println("|   Situando flota en tablero   |");
		System.out.println("|-------------------------------|");
		
		iniciarPortaaviones(1);
		iniciarAcorazados(2);
		iniciarDestructores(3);
		iniciarFragatas(4);
	}
	
	private void iniciarPortaaviones(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			PortaAviones portaAviones = new PortaAviones(miTablero);
			
			portaAviones.iniciarCaracteristicasBarco();
			portaAviones.situarBarcoEnTablero();
			
			flota.add(portaAviones);
		}
	}
	
	private void iniciarAcorazados(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			Acorazado acorazado = new Acorazado(miTablero);
			
			acorazado.iniciarCaracteristicasBarco();
			acorazado.situarBarcoEnTablero();
			
			flota.add(acorazado);
		}
	}
	
	private void iniciarDestructores(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			Destructor destructor = new Destructor(miTablero);
			
			destructor.iniciarCaracteristicasBarco();
			destructor.situarBarcoEnTablero();
			
			flota.add(destructor);
		}
	}
	
	private void iniciarFragatas(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			Fragata fragata = new Fragata(miTablero);
			
			fragata.iniciarCaracteristicasBarco();
			fragata.situarBarcoEnTablero();
			
			flota.add(fragata);
		}
	}
	
	public boolean isFlotaHundida() {
		boolean flotaHundida = true;
		
		//Opción 1: bucle con índices
		/*for (int i = 0; i < flota.size(); i++) {
			if (!flota.get(i).isBarcoHundido()) {
				flotaHundida = false;
				break;
			}
		}*/
		
		//Opción 2: bucle de tipo forEach
		for (Barco barco: flota) {
			if (!barco.isBarcoHundido()) {
				flotaHundida = false;
				break;
			}
		}
		return flotaHundida;
	}
	
	/*public boolean realizarAtaque(String filaColumna, Jugador jugadorOponente) {
		Posicion posicion = tableroAtacante.convertirFilaColumnaAPosicion(filaColumna);
		if (posicion == null) {
			System.out.println("¡ERROR! La posición " + filaColumna + " no es válida");
			return false;
		}
		
		return realizarAtaque(posicion, jugadorOponente);
	}
	
	public boolean realizarAtaque(String fila, String columna, Jugador jugadorOponente) {
		Posicion posicion = tableroAtacante.convertirFilaColumnaAPosicion(fila, columna);
		if (posicion == null) {
			System.out.println("¡ERROR! La posición " + fila + " | " + columna + " no es válida");
			return false;
		}
		
		return realizarAtaque(posicion, jugadorOponente);
	}*/
	

	public boolean realizarAtaque(Posicion posicion, Jugador jugadorOponente) {
		Casilla casilla = jugadorOponente.getCasillaJugadorOponente(posicion);
		ataques.add(casilla);
		
		boolean tocadoTrasAtaque = false;
		if (!casilla.isTocado()) {
			if (casilla.isOcupado()) {
				casilla.setEstadoActual(Casilla.TipoEstado.ESTADO_TOCADO);
				tocadoTrasAtaque = true;
			} else if (casilla.isNoEstado()) {
				casilla.setEstadoActual(Casilla.TipoEstado.ESTADO_AGUA);
			}
			tableroAtacante.modificarCasilla(casilla);
		}
		
		tableroAtacante.mostrarResultadoAtaque(casilla);
		if (tocadoTrasAtaque) {
			tableroAtacante.mostrarEstadoActualTablero();
		}
		
		return tocadoTrasAtaque;
	}	
	
	public void verTableroAtaques() {
		tableroAtacante.mostrarEstadoActualTablero();
	}
	
	public void verTableroPropio() {
		miTablero.mostrarEstadoActualTablero();
	}

	@Override
	public Casilla getCasillaJugadorOponente(Posicion posicion) {
		return miTablero.leerCasilla(posicion);
	}

	@Override
	public Posicion convertirFilaColumnaAPosicion(String fila, String columna) {
		return Tablero.convertirFilaColumnaAPosicion(fila, columna);
	}

	@Override
	public Posicion convertirFilaColumnaAPosicion(String filaColumna) {
		return Tablero.convertirFilaColumnaAPosicion(filaColumna);
	}

}
