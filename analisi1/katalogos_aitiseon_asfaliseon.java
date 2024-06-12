package analisi1;

import java.util.*;
public class katalogos_aitiseon_asfaliseon {
	
	
	static ArrayList<aitisi_asfalisis> aitiseis_asfaliseon  = new ArrayList<aitisi_asfalisis>();
	
	
	public  static void add(aitisi_asfalisis Αitisi_asfalisis) {
		aitiseis_asfaliseon.add(Αitisi_asfalisis);
	}
	
	public  static void remove(aitisi_asfalisis Αitisi_asfalisis) {
		aitiseis_asfaliseon.remove(Αitisi_asfalisis);
	}
	
	public static aitisi search(int id) {
		for (aitisi_asfalisis Αitisi_asfalisis : aitiseis_asfaliseon) {
	        if (Αitisi_asfalisis.get_id() == id) {
	            return Αitisi_asfalisis;
	        }
	    }
	    return null; //Aν δεν βρεθεί το αντικείμενο
	}
	

	
	public  static boolean check(int id) {
		
		for(aitisi_asfalisis Αitisi_asfalisis : aitiseis_asfaliseon )
			if(Αitisi_asfalisis.get_id() == id)
				return true;
		return false;
	}
	

}