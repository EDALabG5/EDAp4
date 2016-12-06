package EDAp4;

public class Nodo {
	private double lat;
	private double lon;
	private int codigo;
	
	public Nodo(int codigo, double lat, double lon){
		this.lat = lat;
		this.lon = lon;
		this.codigo = codigo;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Nodo [lat=" + lat + ", lon=" + lon + ", codigo=" + codigo + "]";
	}

}
