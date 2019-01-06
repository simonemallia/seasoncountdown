/*           Written
 *                 by
 *                    Simone Mallia
 */

import java.util.Scanner;

public class SeasonMain {

	public static void main(String[] args) {
		String scelta;
		Scanner tastiera = new Scanner (System.in);
		Stagioni run = new Stagioni ();
		
		System.out.println("Benvenuto in Season Countdown v0.01");
		System.out.println("Questa applicazione calcola semplicemente quanti giorni mancano alle 4 stagioni terrestri");
		
		while (true) {
		System.out.println("Seleziona la stagione di cui vuoi sapere il countdown");
		System.out.println("1 - Inverno");
		System.out.println("2 - Primavera");
		System.out.println("3 - Estate");
		System.out.println("4 - Autunno");
		System.out.println("5 - Crediti");
		scelta = tastiera.nextLine();
		
		switch(scelta) {
		
		case "1":
			run.inverno();
			System.out.println("Vuoi ritornare al menù? (S/N)");
			if (tastiera.nextLine().equalsIgnoreCase("S")) {
				continue;
			}
			else {
				System.out.println("Termino il programma...");
				System.exit(0);	
			}
			break;
			
		case "2":
			run.primavera();
			System.out.println("Vuoi ritornare al menù? (S/N)");
			if (tastiera.nextLine().equalsIgnoreCase("S")) {
				continue;
			}
			else {
				System.out.println("Termino il programma...");
				System.exit(0);	
			}
			break;
			
		case "3":
			run.estate();
			System.out.println("Vuoi ritornare al menù? (S/N)");
			if (tastiera.nextLine().equalsIgnoreCase("S")) {
				continue;
			}
			else {
				System.out.println("Termino il programma...");
				System.exit(0);	
			}
			break;
			
		case "4":
			run.autunno();
			System.out.println("Vuoi ritornare al menù? (S/N)");
			if (tastiera.nextLine().equalsIgnoreCase("S")) {
				continue;
			}
			else {
				System.out.println("Termino il programma...");
				System.exit(0);	
			}
			break;
			
		case "5":
			System.out.println("Developed by Simone Mallia. Thanks for using my application :)");
			System.out.println("Vuoi ritornare al menù? (S/N)");
			if (tastiera.nextLine().equalsIgnoreCase("S")) {
				continue;
			}
			else {
				System.out.println("Termino il programma...");
				System.exit(0);	
			}
			break;
			
		default:
			System.out.println("Input non riconosciuto. Ritenta");
				
		}
		
		
	}
	}
}
