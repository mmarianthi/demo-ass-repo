package analisi1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Δημιουργία Πελατών και εισαγωγής τους στον αντίστοιχο Κατάλογο
		 
			pelatis Pelatis1 = new pelatis("Maria Papadopoulou","25/07/1979","Tsimiski 72","AB342871",0,3457,false);
			System.out.println ("Epituxis dimiourgia Pelati1!");
			if (!katalogos_pelaton.check(Pelatis1.getId())) {
				katalogos_pelaton.add(Pelatis1);
			}
			
			
			pelatis Pelatis2 = new pelatis("Evanthia Papagianni","19/03/1999","Egnatias 49","XY654321",0,8354,false);
			System.out.println ("Epituxis dimiourgia Pelati2!");
			if (!katalogos_pelaton.check(Pelatis1.getId())) {
				katalogos_pelaton.add(Pelatis2);
			}
			
			pelatis Pelatis3 = new pelatis("Vasilis Karagiannis","17/11/1986","Mitropoleos 35","CD987654",0,8129,false);
			System.out.println ("Epituxis dimiourgia Pelati3!");
			if (!katalogos_pelaton.check(Pelatis1.getId())) {
				katalogos_pelaton.add(Pelatis3);
			}
			
			
			
			
		
		//Δημιουργία Οχημάτων και εισαγωγής τους στον αντίστοιχο Κατάλογο
			oxima Oxima1 = new oxima("ΑΒΧ 1234","Mercedes", "GLC",1600,"mavro",4857);
			System.out.println ("Epituxis dimiourgia Oximatos1!");
			if (!katalogos_oximaton.check(Oxima1.getId())) {
				katalogos_oximaton.add(Oxima1);
			}
			
			oxima Oxima2 = new oxima("ΖΥΚ 5678","Subaru", "Forester",1400, "kokkino",5374);
			System.out.println ("Epituxis dimiourgia Oximatos2!");
			if (!katalogos_oximaton.check(Oxima2.getId())) {
				katalogos_oximaton.add(Oxima2);
			}
			
			oxima Oxima3 = new oxima("ΠΤΛ 9012","Ford", "Ranger",1800, "aspro", 6458 );
			System.out.println ("Epituxis dimiourgia Oximatos3!");
			if (!katalogos_oximaton.check(Oxima3.getId())) {
				katalogos_oximaton.add(Oxima3);
			}
			
		
		//Δημιουργία Πακέτων Ασφάλισης και εισαγωγής τους στον αντίστοιχο Κατάλογο
			paketo_asfalisis Paketo_asfalisis1 = new paketo_asfalisis (3450,120,0);
			System.out.println ("Epituxis dimiourgia Paketou Asfalisis1!");
			if (!katalogos_paketon_asfalisis.check(Paketo_asfalisis1.getId())) {
				katalogos_paketon_asfalisis.paketa_asfalisis.add(Paketo_asfalisis1);
			}
			
			paketo_asfalisis Paketo_asfalisis2 = new paketo_asfalisis (7248,60,0);
			System.out.println ("Epituxis dimiourgia Paketou Asfalisis2!");
			if (!katalogos_paketon_asfalisis.check(Paketo_asfalisis2.getId())) {
				katalogos_paketon_asfalisis.paketa_asfalisis.add(Paketo_asfalisis2);
			}
			
			paketo_asfalisis Paketo_asfalisis3 = new paketo_asfalisis (5621,80,0);
			System.out.println ("Epituxis dimiourgia Paketou Asfalisis3!");
			if (!katalogos_paketon_asfalisis.check(Paketo_asfalisis3.getId())) {
				katalogos_paketon_asfalisis.paketa_asfalisis.add(Paketo_asfalisis3);
			}
			
			
			
		
		//Δημιουργία Αιτήσεων Ασφάλισης και εισαγωγής τους στον αντίστοιχο Κατάλογο
			aitisi_asfalisis Aitisi1 = new aitisi_asfalisis(0000,Pelatis1,Oxima1,Paketo_asfalisis2,"13/02/2024","13/02/2025",9730,Paketo_asfalisis2.getKostos());
			System.out.println ("Epituxis dimiourgia Aitisis Asfalisis1!");
			if (!katalogos_aitiseon_asfaliseon.check(Aitisi1.get_id())) {
				katalogos_aitiseon_asfaliseon.aitiseis_asfaliseon.add(Aitisi1);
			}
			
			aitisi_asfalisis Aitisi2 = new aitisi_asfalisis(0001,Pelatis2,Oxima2,Paketo_asfalisis1,"01/05/2024","01/11/2024",8356,Paketo_asfalisis1.getKostos());
			System.out.println ("Epituxis dimiourgia Aitisis Asfalisis2!");
			if (!katalogos_aitiseon_asfaliseon.check(Aitisi2.get_id())) {
				katalogos_aitiseon_asfaliseon.aitiseis_asfaliseon.add(Aitisi2);
			}
 
			aitisi_asfalisis Aitisi3 = new aitisi_asfalisis(0002,Pelatis2,Oxima3,Paketo_asfalisis3,"07/06/2024","07/12/2024",5380,Paketo_asfalisis3.getKostos());
			System.out.println ("Epituxis dimiourgia Aitisis Asfalisis3!");
			if (!katalogos_aitiseon_asfaliseon.check(Aitisi3.get_id())) {
				katalogos_aitiseon_asfaliseon.aitiseis_asfaliseon.add(Aitisi3);
			}
			
			
			
		//Επιβεβαίωση Αιτήσεων 
		Aitisi1.set_katastasi(true);	
		System.out.println ("Epituxis epivevaiosi Aitisis1!");
		
		Aitisi2.set_katastasi(true);	
		System.out.println ("Epituxis epivevaiosi Aitisis2!");
		
		Aitisi3.set_katastasi(true);	
		System.out.println ("Epituxis epivevaiosi Aitisis3!");
		 
		 //Εκτύπωση Αιτήσεων Ασφαλίσεων
		 System.out.println("Aitiseis Asfaliseon:");
		 for(aitisi_asfalisis Aitisi_asfalisis : katalogos_aitiseon_asfaliseon.aitiseis_asfaliseon ) {
			 Aitisi_asfalisis.printData();
		 }
		 
		 
		//Εκτύπωση Ασφαλίσεων
		 System.out.println("Asfaliseis");
		 for(asfalisi Asfalisi : katalogos_asfaliseon.asfaliseis){
			 Asfalisi.printData();
		 }
		 
		 
		 
		 //Εκτύπωση Πακέτων Ασφαλίσεων 
		 System.out.println("Paketa Asfaliseon:");
		 for(paketo_asfalisis Paketo : katalogos_paketon_asfalisis.paketa_asfalisis) {
			 Paketo.printData();
		 }
		 
		 //Εκτύπωση Πελατών 
		 System.out.println("Pelates");
		 for(pelatis Pelatis : katalogos_pelaton.pelates){
			Pelatis.printData();
		 }
			
		 
		 
		 //Εκτύπωση Οχημάτων
		 System.out.println("Oximata");
		 for(oxima Oxima : katalogos_oximaton.oximata){
			Oxima.printData();
		}
		 
		
     } 
     
}	
