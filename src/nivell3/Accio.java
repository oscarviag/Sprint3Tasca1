package nivell3;

import java.util.ArrayList;
import java.util.List;

public class Accio {

	private List<Command> llistaOrdres = new ArrayList<Command>();
	
	public void rebreOrdre(Command ordre) {
		
		llistaOrdres.add(ordre);
	}
	
	public void donarOrdres() {
		for (Command ordre: llistaOrdres) {
			ordre.execute();
		}
		llistaOrdres.clear();
	}
}
