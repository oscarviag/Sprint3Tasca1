package nivell2;


public class FactoryProvider {
	
	public static AbstractFactory getFactory(String dada) {

		if (dada.equalsIgnoreCase("Telefon")) {
			return new TelefonFactory();

		} else if (dada.equalsIgnoreCase("Adre�a")) {
			return new AdrecaFactory();
		}

		return null;
	}

}
