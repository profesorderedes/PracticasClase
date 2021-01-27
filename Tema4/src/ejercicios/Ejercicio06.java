package ejercicios;
public class Ejercicio06 {

    public static void main(String[] args) {
       
        double res =  cuadradoNumero(18.7);
        System.out.println(res);

    }

    public static double cuadradoNumero(double num) {
       
        double resultado = num * num;
       
        return resultado;
       
    }
}