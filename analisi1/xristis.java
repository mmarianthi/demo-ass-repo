package analisi1;

public class xristis {
	private String _username;
	private String _password;
	private int _id;
	


	public xristis(String _username, String _password, int _id) {
		this._username = _username;
		this._password = _password;
		this._id = _id;
	}
/*
	public boolean check_code(String aUsername) {
	}
	*/

	public int getId() {
		return _id;
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public String getPassword() {
		return this._password;
	}

	public void setPassword(String aPassword) {
		this._password = aPassword;
	}

	public String getUsername() {
		return this._username;
	}

	public void setUsername(String aUsername) {
		this._username = aUsername;
	}
}