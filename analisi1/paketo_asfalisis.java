package analisi1;

public class paketo_asfalisis {
	
	private int id;
	private float kostos;
	private int plithos_poliseon;
	
	public paketo_asfalisis(int id, float kostos, int plithos_poliseon) {
		
		System.out.println ("Parakalw eisagete to id tou paketou");
		this.id = id;
		System.out.println ("Parakalw eisagete to kostos tou paketou");
		this.kostos = kostos;
		this.plithos_poliseon = 0;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getKostos() {
		return kostos;
	}

	public void setKostos(float kostos) {
		this.kostos = kostos;
	}

	public int getPlithos_poliseon() {
		return plithos_poliseon;
	}

	public void setPlithos_poliseon(int plithos_poliseon) {
		this.plithos_poliseon = plithos_poliseon;
	}

	public void printData() {
		System.out.println("To paketo me id " + id + " exei kostos " + kostos + " kai plithos poliseon " + plithos_poliseon + "." );
	}
}
