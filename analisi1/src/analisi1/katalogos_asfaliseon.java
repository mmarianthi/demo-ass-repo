package analisi1;
import java.util.*;

public class katalogos_asfaliseon {
	
	static ArrayList<asfalisi> asfaliseis = new ArrayList<asfalisi>();
	
	
	
	public static void add(asfalisi aAsfaliseis) {
		asfaliseis.add(aAsfaliseis);
	}
	
	public static asfalisi search(int id)
	{
		for(asfalisi Asfalisi : asfaliseis)
			if(Asfalisi.get_id() == id) {
				return Asfalisi;
			}
		return null; //Aν δεν βρεθεί το αντικείμενο
	}
	
	public static boolean check(int id) {
		
		for(asfalisi Asfalisi : asfaliseis)
			if(Asfalisi.get_id() == id)
				return true;
		return false;
	}


	
	


	
}