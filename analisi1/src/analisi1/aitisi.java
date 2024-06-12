package analisi1;

public class aitisi {
	protected int _id;
	protected boolean _katastasi;
	protected pelatis _pelatis;
	protected oxima _oxima;
	protected int idPraktora;
	protected float _poso_ofeilis;
	protected paketo_asfalisis _paketo_asfalisis;
	protected String _enarxi_asfaleias;
	protected String _lixi_asfaleias;
	protected boolean _katastasi_ofeilis;
	
	public int get_id() {
		return this._id;
	}

	public boolean get_katastasi() {
		return this._katastasi;
	}

	public void set_katastasi(boolean aKatastasi) {
		this._katastasi=aKatastasi;
		
		
	}


	
	public oxima get_oxima() {
		return _oxima;
	}

	public void set_oxima(oxima _oxima) {
		this._oxima = _oxima;
	}
	

	public int getIdPraktora() {
		return idPraktora;
	}

	public void setIdPraktora(int idPraktora) {
		this.idPraktora = idPraktora;
	}

	public float get_poso_ofeilis() {
		return _poso_ofeilis;
	}

	public void set_poso_ofeilis(float _poso_ofeilis) {
		this._poso_ofeilis = _poso_ofeilis;
	}

	public paketo_asfalisis get_paketo_asfalisis() {
		return _paketo_asfalisis;
	}

	public void set_paketo_asfalisis(paketo_asfalisis _paketo_asfalisis) {
		this._paketo_asfalisis = _paketo_asfalisis;
	}

	public String get_enarxi_asfaleias() {
		return _enarxi_asfaleias;
	}

	public void set_enarxi_asfaleias(String _enarxi_asfaleias) {
		this._enarxi_asfaleias = _enarxi_asfaleias;
	}

	public String get_lixi_asfaleias() {
		return _lixi_asfaleias;
	}

	public void set_lixi_asfaleias(String _lixi_asfaleias) {
		this._lixi_asfaleias = _lixi_asfaleias;
	}

	public boolean get_katastasi_ofeilis() {
		return _katastasi_ofeilis;
	}

	public void set_katastasi_ofeilis(boolean _katastasi_ofeilis) {
		this._katastasi_ofeilis = _katastasi_ofeilis;
	}

	public pelatis get_pelatis() {
		return _pelatis;
	}
	
	public void set_pelatis(pelatis _pelatis) {
		this._pelatis = _pelatis;
	}

	

	public aitisi(int _id ,paketo_asfalisis _paketo_asfalisis, String _enarxi_asfaleias,
			String _lixi_asfaleias, pelatis _pelatis, oxima _oxima, int _idPraktora) {
		this._id = _id;
		this._poso_ofeilis = 0;
		this._paketo_asfalisis = _paketo_asfalisis;
		this._enarxi_asfaleias = _enarxi_asfaleias;
		this._lixi_asfaleias = _lixi_asfaleias;
		this._pelatis = _pelatis;
		this._oxima = _oxima;
		this._katastasi=false;
		this.idPraktora = _idPraktora;
	
	}
	
		
	
}