package geometria;

public class Cilindro {
	
	private int altura;
	private int radio;
	private double PI = 3.141592;
	
	public Cilindro(){
		
	}
	
	public Cilindro(int altura, int radio){
		
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		return 2 * PI * radio * (radio + altura); 
	}
	
	public double getVolumen() {
		return PI * (radio * radio) * altura;
	}

	public String toString() {
		return "[altura=" + altura + ", radio=" + radio + "]";
	}
	

	

	
}
