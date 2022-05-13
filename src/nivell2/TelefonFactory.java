package nivell2;

public class TelefonFactory implements AbstractFactory{

	@Override
	public ITelefon getTlf(String paisTelefon) {
	
		if ("Espanya".equalsIgnoreCase(paisTelefon)) {
			return new TelefonEspanyol();
		} else if ("Anglaterra".equalsIgnoreCase(paisTelefon)) {
			return new TelefonAngles();
		}
		return null;
	}

	@Override
	public IAdreca getAdd(String adreca) {
		// TODO Auto-generated method stub
		return null;
	}

}
