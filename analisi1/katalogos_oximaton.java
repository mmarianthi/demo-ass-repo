package analisi1;
 
import java.util.*;

	public class katalogos_oximaton {
	
	static ArrayList <oxima> oximata = new ArrayList<oxima>();
	

	public static void add( oxima _oxima)
	{
		oximata.add(_oxima);
	
	}
	
	public static void remove(oxima _oxima)
	{
		oximata.remove(_oxima);
	}

	
	public static oxima search(int id) {
	    
	    for (oxima oxima : oximata) {
	        if (oxima.getId() == id) {
	            return oxima;
	        }
	    }
	    return null; //Aν δεν βρεθεί το αντικείμενο
	}
	
	public static boolean check(int id)
	{
		for(oxima oxima : oximata)
			if(oxima.getId() == id)
				return true;
		return false;
	}

	
	
	

}
