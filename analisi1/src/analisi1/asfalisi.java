package analisi1;

public class asfalisi {
	private int id;
	private float poso_ofeilis;
	private paketo_asfalisis paketo_asfalisis;
	private String enarxi_asfaleias;
	private String lixi_asfaleias;
	private pelatis pelatis;
	private oxima oxima;
	private boolean katastasi_ofeilis;
	private int  idPraktora;
	
	
	

	public asfalisi(int _id, paketo_asfalisis _paketo_asfalisis, String _enarxi_asfaleias,
			String _lixi_asfaleias, pelatis _pelatis, oxima _oxima, int  idPraktora) {
		this.id = _id;
		this.poso_ofeilis = 0;
		this.paketo_asfalisis = _paketo_asfalisis;
		this.enarxi_asfaleias = _enarxi_asfaleias;
		this.lixi_asfaleias = _lixi_asfaleias;
		this.pelatis = _pelatis;
		this.oxima = _oxima;
		this.katastasi_ofeilis = false;
		this.idPraktora = idPraktora;
		
	}	
	
	public int get_id() {
		return id;
	}
	public void set_id(int _id) {
		this.id = _id;
	}
	public float get_poso_ofeilis() {
		return poso_ofeilis;
	}
	public void set_poso_ofeilis(float _poso_ofeilis) {
		this.poso_ofeilis = _poso_ofeilis;
	}
	public paketo_asfalisis get_paketo_asfalisis() {
		return paketo_asfalisis;
	}
	public void set_paketo_asfalisis(paketo_asfalisis _paketo_asfalisis) {
		this.paketo_asfalisis = _paketo_asfalisis;
	}
	public String get_enarxi_asfaleias() {
		return enarxi_asfaleias;
	}
	public void set_enarxi_asfaleias(String _enarxi_asfaleias) {
		this.enarxi_asfaleias = _enarxi_asfaleias;
	}
	public String get_lixi_asfaleias() {
		return lixi_asfaleias;
	}
	public void set_lixi_asfaleias(String _lixi_asfaleias) {
		this.lixi_asfaleias = _lixi_asfaleias;
	}
	public pelatis get_pelatis() {
		return pelatis;
	}
	public void set_pelatis(pelatis _pelatis) {
		this.pelatis = _pelatis;
	}
	public oxima get_oxima() {
		return oxima;
	}
	public void set_oxima(oxima _oxima) {
		this.oxima = _oxima;
	}
	public boolean is_katastasi_ofeilis() {
		return katastasi_ofeilis;
	}
	public void set_katastasi_ofeilis(boolean _katastasi_ofeilis) {
		this.katastasi_ofeilis = _katastasi_ofeilis;
	}
	
	
	public int getIdPraktora() {
		return idPraktora;
	}

	public void setIdPraktora(int idPraktora) {
		this.idPraktora = idPraktora;
	}

	
	public void printData()
	{   
		System.out.println("Stoixeia asfalisis me id " + id + " pou antistoixei ston praktora me id " + idPraktora);
		System.out.println("Pelatis: " + pelatis.getOnomateponimo());	
		System.out.println("Oxima: " + oxima.getAr_kikloforias());	
		System.out.println("Paketo asfalisis: " + paketo_asfalisis);
		System.out.println("Enarxi asfaleias: " + enarxi_asfaleias);	
		System.out.println("Lixi asfaleias: " + lixi_asfaleias);	
		if (katastasi_ofeilis)
			System.out.println("O pelatis autis ths Asfalisis ofeilei " + poso_ofeilis + "€.");	
		else
			System.out.println("O pelatis autis ths Asfalisis den ofeilei kanena poso.");
		System.out.println();	
	}

}