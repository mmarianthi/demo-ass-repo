package analisi1;

public class pelatis {
	
 private String onomateponimo;
 private String imerominia_gennisis;
 private String diefthinsi;
 private String ar_dip_odigisis;
 private int atiximata;
 private int id;
 private boolean katastasi_ofeilis;
 

 
 
 public pelatis(String onomateponimo, String imerominia_gennisis, String diefthinsi, String ar_dip_odigisis,
		int atiximata, int id, boolean katastasi_ofeilis) {
	 
	this.onomateponimo = onomateponimo;
	this.imerominia_gennisis = imerominia_gennisis;
	this.diefthinsi = diefthinsi;
	this.ar_dip_odigisis = ar_dip_odigisis;
	this.atiximata = atiximata;
	this.id = id;
	this.katastasi_ofeilis = katastasi_ofeilis;
}


	
	
	 
	 public String getOnomateponimo() {
		 return onomateponimo;
	 }


	public void setOnomateponimo(String onomateponimo) {
		this.onomateponimo = onomateponimo;
	}
	
	
	public String getImerominia_gennisis() {
		return imerominia_gennisis;
	}
	
	
	public void setImerominia_gennisis(String imerominia_gennisis) {
		this.imerominia_gennisis = imerominia_gennisis;
	}
	
	
	
	public String getDiefthinsi() {
		return diefthinsi;
	}
	
	
	public void setDiefthinsi(String diefthinsi) {
		this.diefthinsi = diefthinsi;
	}
	
	
	public String getAr_dip_odigisis() {
		return ar_dip_odigisis;
	}
	
	public void setAr_dip_odigisis(String ar_dip_odigisis) {
		this.ar_dip_odigisis = ar_dip_odigisis;
	}
	
	
	public int getAtiximata() {
		return atiximata;
	}
	
	public void setAtiximata(int atiximata) {
		this.atiximata = atiximata;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean isKatastasi_ofeilis() {
		return katastasi_ofeilis;
	}
	
	public void setKatastasi_ofeilis(boolean katastasi_ofeilis) {
		this.katastasi_ofeilis = katastasi_ofeilis;
	}
	




	public void printData() {
			System.out.println("Stoixeia pelati me id " + id );
			System.out.println("Onomateponimo: " + onomateponimo);	
			System.out.println("Imerominia gennisis: " + imerominia_gennisis);	
			System.out.println("Diefthinsi: " + diefthinsi);	
			System.out.println("Arithmos diplomatos odigisis: " + ar_dip_odigisis);	
			System.out.println("Atiximata: " + atiximata);	
			if(!katastasi_ofeilis)
				System.out.println("O pelatis ofeilei sthn asfalistiki.");
			else
				System.out.println("O pelatis den ofeilei sthn asfalistiki.");
			System.out.println();	
		}
	 
	 public void increase_atiximata() {
		 this.atiximata++;
	 }
	 
 
}
