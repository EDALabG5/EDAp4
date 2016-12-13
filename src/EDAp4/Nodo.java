package EDAp4;

public class Nodo{

	private String ID, latitud, longitud; //Strings para los valores que definen el nodo (estacion)
	//contructor
	public Nodo(String ID, String lat,String lon){
		this.ID = ID;
		this.latitud = lat;
		this.longitud = lon;
	}
	
	//Latitud y Longitud donde se encuentra el nodo
	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	
	public void setID(String ID){
		this.ID = ID;
	}
	
	public String getID() {
		return this.ID;
	}

	@Override
	public String toString() {
		return "Nodo [ID=" + ID + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	
	
}
