package analisi1;

public class ofeili {
	
	private String _pedio1 = "ofeilei";
	private String _pedio2 = "exoflithike";
	public asfalisi asfalisi;
	
	
	public ofeili(String _pedio1, String _pedio2, analisi1.asfalisi asfalisi) {
		super();
		this._pedio1 = _pedio1;
		this._pedio2 = _pedio2;
		this.asfalisi = asfalisi;
	}
	

	/*
	public String get_pedia(Object aPedio1, Object aPedio2) {
		
	}
	*/

	

	public void setPedio1(String aPedio1) {
		this._pedio1 = aPedio1;
	}

	public String getPedio1() {
		return this._pedio1;
	}

	public void setPedio2(String aPedio2) {
		this._pedio2 = aPedio2;
	}

	public String getPedio2() {
		return this._pedio2;
	}
}