package nivell2;

import java.util.ArrayList;

public class Execucio {
	
	static ArrayList<Fitxa> agenda = new ArrayList<>();

	public static void main(String[] args) {
		
		
		// Fàbrica de Telefons
		AbstractFactory fabricaTelf = FactoryProvider.getFactory("Telefon");
		
		// Fàbrica de telefons per nacionalitat
		ITelefon telfEsp = fabricaTelf.getTlf("Espanya");
		String telf1 = telfEsp.getTelefon();
		System.out.println(telf1);		
	
		ITelefon telfAngl = fabricaTelf.getTlf("Anglaterra");
		String telf2 =telfAngl.getTelefon();
		System.out.println(telf2);
		
		// Fàbrica d'Adreces
		AbstractFactory fabricaAdd = FactoryProvider.getFactory("Adreça");
		
		// Fàbrica d'adreces per nacionalitat
		IAdreca addrEsp = fabricaAdd.getAdd("Espanya");
		String addr1 = addrEsp.getAdreca();
		System.out.println(addr1);
		
		IAdreca addrAng = fabricaAdd.getAdd("Anglaterra");
		String addr2 =addrAng.getAdreca();
		System.out.println(addr2);
		
		agenda.add(new Fitxa(telf1,addr1));
		agenda.add(new Fitxa(telf2,addr2));
		
		for (Fitxa element : agenda) {
			
			System.out.println(element.adreca + " " + element.telefon );
		}
		
		
		
		
		
	}

}
