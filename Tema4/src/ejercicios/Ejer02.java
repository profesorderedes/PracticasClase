package ejercicios;
public class Ejer02 {

    public static void main(String[] args) {
        
    	String frase = saludar("María",35);
    	
    	System.out.println(frase);
    	
    	
    	
    }

    static String saludar(String nombre, int edad) {

        return "Hola, " + nombre + ", no parece que " + "tengas " + edad 
        		+ " años.";

    }

}