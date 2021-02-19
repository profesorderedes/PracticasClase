package taller;

public class Inicio {

	public static void main(String[] args) {

		// Creamos algunos objetos Motor y Lavadora para hacer pruebas.
		Motor motor1 = new Motor(1, "Mitsubishi", "V3");
		Motor motor2 = new Motor(2, "Samsung", "A1");

		Lavadora lava1 = new Lavadora(100, motor1, "Balay", 400);
		Lavadora lava2 = new Lavadora(101, motor1, "Balay", 475);
		Lavadora lava3 = new Lavadora(102, motor2, "Siemens", 325);

		// Probamos el toString() de Lavadora.
		System.out.println(lava1.toString());
		
	}

}
