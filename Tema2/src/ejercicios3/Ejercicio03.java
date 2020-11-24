package ejercicios3;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
       
        while (true) {
       
            int num1 = (int) (Math.random() * 100 + 1);
            int num2 = (int) (Math.random() * 100 + 1);
            int suma;
           
            System.out.println(num1 + " y " + num2);
           
            System.out.println("¿Cuanto es " + num1 + " + " + num2 + "?");
           
            System.out.print("introduce el resultado: ");
            suma = entrada.nextInt();
           
            while (suma != (num1 + num2)) {
               
                System.out.print("Incorrecto. Prueba otra vez: ");
                suma = entrada.nextInt();
               
            }
           
            if (suma == (num1 + num2)) {
               
                System.out.println("Correcto.\n");
               
            }
           
        }

    }

}