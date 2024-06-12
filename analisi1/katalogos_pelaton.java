package analisi1;
import java.util.ArrayList;

public class katalogos_pelaton {
	static ArrayList<pelatis> pelates = new ArrayList<pelatis>() ;
	
	
	public static void add( pelatis pelatis)
	{
		pelates.add(pelatis);
	
	}
	public static void remove(pelatis pelatis)
	{
		pelates.remove(pelatis);
	}

	
	public static pelatis search(int id) {
	    
	    for (pelatis pelatis : pelates) {
	        if (pelatis.getId() == id) {
	            return pelatis;
	        }
	    }
	    return null; //Aν δεν βρεθεί το αντικείμενο
	}
	
	public static boolean check(int id)
	{
		for(pelatis pelatis : pelates)
			if(pelatis.getId() == id)
				return true;
		return false;
	}
}
