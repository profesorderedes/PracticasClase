package ejercicios;
public class Ejer07 {

    public static void main(String[] args) {

        float resultado=cubo(1.5f);
        System.out.println(resultado);
        
    }
    
    static float cubo(float numero) {
       
        float cubo=numero*numero*numero;
       
        return cubo;
    }
}