package condicionales;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
       
        int mayorDeEdad = 18;
        System.out.println("¿Qué edad tienes?");
        int edad = entrada.nextInt();
       
        String respuesta;
       
        respuesta = edad < mayorDeEdad ? "Verdadero." : "Falso.";
       
//        if(edad < mayorDeEdad) {
//            System.out.println("Verdadero");
//        }else {
//            System.out.println("Falso.");
//        }
       
        System.out.println(respuesta);
    }

}