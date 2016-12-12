package EDAp4;

import graphsDSESIUCLM.Vertex;

public class Trayecto {
	Nodo n1, n2;
	int tiempo;
	
	public Trayecto(Nodo n1, Nodo n2, int tiempo){
		this.n1 = n1;
		this.n2 = n2;
		this.tiempo = tiempo;
	}

	public Nodo getN1() {
		return n1;
	}

	public void setN1(Nodo n1) {
		this.n1 = n1;
	}

	public Nodo getN2() {
		return n2;
	}

	public void setN2(Nodo n2) {
		this.n2 = n2;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Trayecto [n1=" + n1.toString() + ", n2=" + n2.toString() + ", tiempo=" + tiempo + "]";
	}
}
