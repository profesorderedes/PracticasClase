package inicio;

public class Inicio {
	
	public static void main(String[] args) {
		JuegoHundirLaFlota hundirLaFlota = new JuegoHundirLaFlota();
		
		hundirLaFlota.prepararJugadores();
		hundirLaFlota.jugar();
		hundirLaFlota.mostrarGanador();
	}

}
