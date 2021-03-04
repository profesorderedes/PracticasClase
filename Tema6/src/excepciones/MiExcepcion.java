package excepciones;

public class MiExcepcion extends Exception {

	private static final String MESSAGE = "Mi Excepcion";
	
	public MiExcepcion() {
		super(MESSAGE);
	}
	
}
