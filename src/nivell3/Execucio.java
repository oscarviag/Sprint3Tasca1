package nivell3;

public class Execucio {

	public static void main(String[] args) {
		
		Cotxe cotxe = new Cotxe();
		
		Accelerar acceleraCotxe =  new Accelerar(cotxe);
		Arrencar arrencaCotxe =  new Arrencar(cotxe);
		Frenar frenaCotxe =  new Frenar(cotxe);
		
		Vaixell vaixell = new Vaixell();
		
		Accelerar acceleraVaixell =  new Accelerar(vaixell);
		Arrencar arrencaVaixell =  new Arrencar(vaixell);
		Frenar frenaVaixell =  new Frenar(vaixell);
		
		Avio avio = new Avio();
		
		Accelerar acceleraAvio =  new Accelerar(avio);
		Arrencar arrencaAvio =  new Arrencar(avio);
		Frenar frenaAvio =  new Frenar(avio);
		
		Bicicleta bicicleta = new Bicicleta();
		
		Accelerar acceleraBicicleta =  new Accelerar(bicicleta);
		Arrencar arrencaBicicleta =  new Arrencar(bicicleta);
		Frenar frenaBicicleta =  new Frenar(bicicleta);
		
		Accio accio = new Accio();
		accio.rebreOrdre(acceleraCotxe);
		accio.rebreOrdre(arrencaCotxe);
		accio.rebreOrdre(frenaCotxe);
		accio.rebreOrdre(arrencaAvio);
		accio.rebreOrdre(acceleraAvio);
		accio.rebreOrdre(frenaAvio);
		accio.rebreOrdre(arrencaVaixell);
		accio.rebreOrdre(acceleraVaixell);
		accio.rebreOrdre(frenaVaixell);
		accio.rebreOrdre(arrencaBicicleta);
		accio.rebreOrdre(acceleraBicicleta);
		accio.rebreOrdre(frenaBicicleta);
		
		accio.donarOrdres();
		
		
		
		

	}

}
