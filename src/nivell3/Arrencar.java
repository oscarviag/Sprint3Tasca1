package nivell3;

public class Arrencar implements Command{

	private Parquing ordre;
	
	public Arrencar(Parquing ordre) {
		this.ordre = ordre;
	}
	
	@Override
	public void execute() {
		ordre.arrenca();
		
	}
}
