/*           Written
 *                 by
 *                    Simone Mallia
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Stagioni {
	
	Calendar inverno = Calendar.getInstance();
	Calendar primavera = Calendar.getInstance();
	Calendar estate = Calendar.getInstance();
	Calendar autunno = Calendar.getInstance();
	long now = System.currentTimeMillis();
	SimpleDateFormat df = new SimpleDateFormat ("DDD");
	
	
	public  void inverno() {
		inverno.set(Calendar.MONTH, Calendar.DECEMBER);
		inverno.set(Calendar.DAY_OF_MONTH, 22);
		long untilwinter = inverno.getTimeInMillis() - now;
		Date winterdate = new Date (untilwinter);
		
		System.out.println("Mancano esattamente " + df.format(winterdate) + " giorni al prossimo inverno.");
		
	}
	
	public void primavera () {
		primavera.set(Calendar.MONTH, Calendar.MARCH);
		primavera.set(Calendar.DAY_OF_MONTH, 21);
		long untilspring = primavera.getTimeInMillis() - now;
		Date springdate = new Date(untilspring);
		
		System.out.println("Mancano esattamente " + df.format(springdate) + " giorni alla prossima primavera.");
		
	}
	
	public void estate() {
		estate.set(Calendar.MONTH, Calendar.JUNE);
		estate.set(Calendar.DAY_OF_MONTH, 22);
		long untilsummer = estate.getTimeInMillis() - now;
		Date summerdate = new Date(untilsummer);
		
		System.out.println("Mancano esattamente " + df.format(summerdate) + " giorni alla prossima estate.");
		
	}
	
	public void autunno() {
		autunno.set(Calendar.MONTH, Calendar.SEPTEMBER);
		autunno.set(Calendar.DAY_OF_MONTH, 23);
		long untilautumn = autunno.getTimeInMillis() - now;
		Date autumndate = new Date (untilautumn);
		
		System.out.println("Mancano esattamente " + df.format(autumndate) + " giorni al prossimo autunno.");
	}
	
	
}
