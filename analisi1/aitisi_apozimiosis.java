package analisi1;

public class aitisi_apozimiosis extends aitisi {
	
	int atiximata;
	
	
	public aitisi_apozimiosis(int _id, float _poso_ofeilis, boolean _katastasi ,paketo_asfalisis _paketo_asfalisis, String _enarxi_asfaleias,
			String _lixi_asfaleias, pelatis _pelatis, oxima _oxima, int _idPraktora)
	{
		super(_id, _paketo_asfalisis,  _enarxi_asfaleias,
				 _lixi_asfaleias,_pelatis,_oxima, _idPraktora);
		
	}

	public int getAtiximata() {
		return atiximata;
	}

	public void setAtiximata(int atiximata) {
		this.atiximata = atiximata;
	}
	
	public void increase_atiximata() {
		atiximata++;
	}
	
}