package nivell1;

import java.util.ArrayList;

public class Undo {
	
	private Undo() {

	}

	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
	}

	private static Undo instance = null;

	public void llistar(ArrayList<String> contingut) {
		for (String element : contingut) {
			System.out.println(element);
		}
	}
	
	public ArrayList<String> afegir(ArrayList<String> contingut, String afegit) {
		contingut.add(afegit);
		return contingut;
	}
	
	public ArrayList<String> eliminar(ArrayList<String> contingut, String esborrat) {
		contingut.remove(esborrat);
		return contingut;
	}

}
