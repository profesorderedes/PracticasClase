package conversion;

public class Conversor {

	private final static double KM_A_MILLAS = 0.621371;
	private final static double MB_A_ATM = 0.000986923;
	private final static double CAL_A_JULIOS = 4.184;

	Conversor() {

	}

	public static void millas(double km) {
		System.out.println(km * KM_A_MILLAS);
	}

	public static void km(double millas) {
		System.out.println(millas / KM_A_MILLAS);
	}

	public static void atmosferas(double milibares) {
		System.out.println(milibares * MB_A_ATM);
	}

	public static void milibares(double atmosferas) {
		System.out.println(atmosferas / MB_A_ATM);
	}

	public static void julios(double calorias) {
		System.out.println(calorias * CAL_A_JULIOS);
	}

	public static void calorias(double julios) {
		System.out.println(julios / CAL_A_JULIOS);
	}
}
