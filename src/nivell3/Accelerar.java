package nivell3;

public class Accelerar implements Command{

	private Parquing ordre;
	
	public Accelerar(Parquing ordre) {
		this.ordre = ordre;
	}
	
	@Override
	public void execute() {
		ordre.accelera();
		
	}


}
