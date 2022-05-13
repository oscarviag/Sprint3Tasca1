package nivell2;

public interface AbstractFactory {
	
	IAdreca getAdd(String pais);
	ITelefon getTlf(String pais);
	
}
