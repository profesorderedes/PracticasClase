package interfaces.vehiculos;

public interface IConduccion {
	
	public void arrancar(); //Encender motor
	public void parar(); //Apagar motor
	
	public void acelerar(); //Aumentar km/h ¿Cuántos? Depende del vehiculo
	public void frenar(); //Dismunuir km/h ¿Cuántos? Depende del vehiculo
	
	
	
	//Este no lo hemos utilizado en clase...
	//¿Por qué no probáis de usarlo?
	public void frenoDeMano(); //Disminuir ¿Cuántos? Depende del vehiculo
	
	//Como en casa ha sido un poco aburrido...
	//¿Y si el acelerar y frenar pudieran modificar la velocidad directamente?
	//Para ello, podemos definir dos nuevos métodos acelerar/frenar
	public void acelerar(int velocidad); 
	public void frenar(int velocidad); 

}
