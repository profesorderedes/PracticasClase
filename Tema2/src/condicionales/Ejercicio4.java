package condicionales;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca contraseña: ");
        float contraseña = entrada.nextFloat();
       
        if (contraseña == 1234) {
        System.out.println("Acceso concedido");
        }else {
            System.out.println("Acceso denegado");
           
        }

    }

}
