package analisi1;


public class oxima {
   private String ar_kikloforias;
   private String marka;
   private String montelo;
   private float kivika_ek;
   private String xroma;
   private int id;
   

   public oxima (String par_kikloforias,String pmarka
		   ,String pmontelo,float pkivika_ek,
		   String pxroma,int pid) {
	   ar_kikloforias=par_kikloforias;
	   marka=pmarka;
	   montelo=pmontelo;
	   kivika_ek=pkivika_ek;
       xroma=pxroma;
       id=pid;
   }


	public String getAr_kikloforias() {
		return ar_kikloforias;
	}
	
	
	public void setAr_kikloforias(String ar_kikloforias) {
		this.ar_kikloforias = ar_kikloforias;
	}
	
	
	public String getMarka() {
		return marka;
	}
	
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	
	public String getMontelo() {
		return montelo;
	}
	
	
	public void setMontelo(String montelo) {
		this.montelo = montelo;
	}
	
	
	public float getKivika_ek() {
		return kivika_ek;
	}
	
	
	public void setKivika_ek(float kivika_ek) {
		this.kivika_ek = kivika_ek;
	}
	
	
	public String getXroma() {
		return xroma;
	}
	
	
	public void setXroma(String xroma) {
		this.xroma = xroma;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
   
	
	public void printData()
	{   
		System.out.println("Stoixeia oximatos me id " + id );
		System.out.println("Arithmos kikloforias: " + ar_kikloforias);	
		System.out.println("Marka: " + marka);	
		System.out.println("Montelo: " + montelo);	
		System.out.println("Kivika ekatosta: " + kivika_ek);	
		System.out.println("Xroma: " + xroma);	
		System.out.println();	
	}
	
}

