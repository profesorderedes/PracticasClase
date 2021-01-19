
// Ejemplo de buscar el mínimo y el máximo en un array.
public class Ejemplo10 {

	public static void main(String[] args) {

		double precios[] = { 42, 3.5, 15, 90.25, 10, 12 };
		int posMin = 0;
		int posMax = 0;
		double media = 0;

		for (int i = 1; i < precios.length; i++) {

			if (precios[i] < precios[posMin]) {
				posMin = i;
			}
			if (precios[i] > precios[posMax]) {
				posMax = i;
			}
			media = media + precios[i];

		}

		media = media / precios.length;

		System.out.println("Mínimo: " + precios[posMin] + ", en la posición " + posMin);
		System.out.println("Máximo: " + precios[posMax] + ", en la posición " + posMax);
		System.out.println("Media: " + media);

	}

}
