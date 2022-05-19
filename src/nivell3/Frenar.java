package nivell3;

public class Frenar implements Command{

private Parquing ordre;
	
	public Frenar(Parquing ordre) {
		this.ordre = ordre;
	}
	
	@Override
	public void execute() {
		ordre.frena();
		
	}

}
