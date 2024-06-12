package analisi1;

import java.util.*;

public class katalogos_paketon_asfalisis {
	
	static ArrayList<paketo_asfalisis> paketa_asfalisis= new ArrayList<paketo_asfalisis>();
	
	
	public static void add (paketo_asfalisis paketo) {
		paketa_asfalisis.add(paketo);
	}
	
	public static void remove (paketo_asfalisis paketo) {
		paketa_asfalisis.remove(paketo);
	}
	
	
	
	public static paketo_asfalisis search(int id) {
	    
	    for (paketo_asfalisis paketo : paketa_asfalisis) {
	        if (paketo.getId() == id) {
	            return paketo;
	        }
	    }
	    return null; //Aν δεν βρεθεί το αντικείμενο
	}
	
	public static boolean check(int id)
	{
		for(paketo_asfalisis paketo : paketa_asfalisis)
			if(paketo.getId() == id)
				return true;
		return false;
	}
}

