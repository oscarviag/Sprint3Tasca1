package nivell1;

import java.util.ArrayList;
import java.util.Scanner;

public class Execucio {
	
	static ArrayList <String> llistat = new ArrayList <String>();
	
	
	public static void main(String[] args) {
		
		int opcio = 4;
		Scanner menu = new Scanner(System.in);
		Scanner afegir = new Scanner(System.in);
		Scanner esborrar = new Scanner(System.in);
		
		do {
		      
		System.out.println("Tria una opció:");
		System.out.println("0 : Afegir nova comanda");		
		System.out.println("1 : Eliminar comanda");
		System.out.println("2 : Llistar comandes introduïdes");
		System.out.println("3 : Sortir");
			
        opcio = menu.nextInt();

        switch(opcio) {
        case 0: {
        		System.out.println("Introdueix la comanda a afegir:");        		
        		String comanda = afegir.nextLine();      		
        		Undo undo = Undo.getInstance();
        		llistat = undo.afegir(llistat, comanda);
        		
        		break;
        	}
        case 1: {
        		System.out.println("Introdueix la comanda a esborrar:");        		
        		String comanda = esborrar.nextLine();         		
        		Undo undo = Undo.getInstance();
        		llistat = undo.eliminar(llistat, comanda);
        		break;
        	}
        case 2: {      	
        		Undo undo = Undo.getInstance();
        		undo.llistar(llistat);
        		break;
        	}
        case 3: {     	
        		break;
        	}
        default: {
        		System.out.println("La opció triada no és correcte");
        	};
        }
		} while (opcio!=3);
        
		menu.close();
		afegir.close();
		esborrar.close();
		System.out.println("Fi");
	}

}
