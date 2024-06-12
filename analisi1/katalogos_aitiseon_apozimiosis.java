package analisi1;

import java.util.ArrayList;

public class  katalogos_aitiseon_apozimiosis {
	
	static ArrayList<aitisi_apozimiosis> aitiseis_apozimiosis = new ArrayList<aitisi_apozimiosis>();
	
	
	public  static void add(aitisi_apozimiosis Aitisi_apozimiosis) {
		aitiseis_apozimiosis.add(Aitisi_apozimiosis);
	}
	
	public  static void remove(aitisi_apozimiosis Aitisi_apozimiosis) {
		aitiseis_apozimiosis.remove(Aitisi_apozimiosis);
	}
	
	public static aitisi  search(int id) {
		for (aitisi_apozimiosis Aitisi_apozimiosis : aitiseis_apozimiosis) {
	        if (Aitisi_apozimiosis.get_id() == id) {
	            return Aitisi_apozimiosis;
	        }
	    }
	    return null; //Aν δεν βρεθεί το αντικείμενο
	}
	
	public static  boolean check(int id) {
		
		for(aitisi_apozimiosis Aitisi_apozimiosis  : aitiseis_apozimiosis )
			if(Aitisi_apozimiosis.get_id()  == id)
				return true;
		return false;
	}
	
	}
