package condicionales;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el período");
		String dia = entrada.nextLine();

		String horaCierre = dia.equals("entre semana") ? "20:00" : "14:00";

//		if(dia.equals("entre semana")) {
//			horaCierre = "20:00";
//		}else {
//			horaCierre = "14:00";
//		}
		
		System.out.println(horaCierre);
	}

}
