package analisi1;

public class praktoras extends xristis {
	private int _plithos_asfaliseon;
	
	public praktoras(String _username, String _password, int _id) {
		super(_username, _password, _id);
		this._plithos_asfaliseon = 0;
	}

	
	public int getPlithos_asfaliseon() {
		return this._plithos_asfaliseon;
	}

	public void setPlithos_asfaliseon(int aPlithos_asfaliseon) {
		this._plithos_asfaliseon = aPlithos_asfaliseon;
	}
}