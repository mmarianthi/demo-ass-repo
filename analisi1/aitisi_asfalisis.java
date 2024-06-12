package analisi1;

public class aitisi_asfalisis extends aitisi {

	private asfalisi _asfalisi;
	private float kostos;

	public aitisi_asfalisis(int _id, pelatis _pelatis, oxima _oxima, paketo_asfalisis _paketo_asfalisis, String _enarxi_asfaleias,
			String _lixi_asfaleias,  int  idPraktora, float kostos) {
		
		super(_id, _paketo_asfalisis,  _enarxi_asfaleias, _lixi_asfaleias,_pelatis,_oxima, idPraktora);
		
		this.setKostos(kostos);
	}
	
	public void set_katastasi(boolean aKatastasi) {
		this._katastasi=aKatastasi;
		
		if(_katastasi)
		{	
			 _asfalisi = new asfalisi( _id, _paketo_asfalisis,_enarxi_asfaleias,_lixi_asfaleias,_pelatis,_oxima,idPraktora);
			 if (!katalogos_asfaliseon.check(_asfalisi.get_id()))
					katalogos_asfaliseon.asfaliseis.add(_asfalisi);
		}
		
	}
	
	public void printData()
	{   
		System.out.println("Stoixeia aitisis asfalisis me id " + _id + "pou antistoixei ston praktora me id" + idPraktora + ":");
		System.out.println("Pelatis: " + _pelatis.getOnomateponimo());	
		System.out.println("Oxima: " + _oxima.getAr_kikloforias());	
		System.out.println("Paketo asfalisis: " + _paketo_asfalisis);
		System.out.println("Enarxi asfaleias: " + _enarxi_asfaleias);	
		System.out.println("Lixi asfaleias: " + _lixi_asfaleias);	
		
	}

	public float getKostos() {
		return kostos;
	}

	public void setKostos(float kostos) {
		this.kostos = kostos;
	}
	
}