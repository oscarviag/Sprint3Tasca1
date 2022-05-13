package nivell2;

public class AdrecaFactory implements AbstractFactory{

	public IAdreca getAdd(String paisAdreca) {
	
		if ("Espanya".equalsIgnoreCase(paisAdreca)) {
			return new AdrecaEspanyol();
		} else if ("Anglaterra".equalsIgnoreCase(paisAdreca)) {
			return new AdrecaAngles();
		}
		return null;
	}

	public ITelefon getTlf(String telefon) {
		// TODO Auto-generated method stub
		return null;
	}
}
