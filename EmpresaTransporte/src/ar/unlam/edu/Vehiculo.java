package ar.unlam.edu;

public class Vehiculo {

	private String patente;
	private Chofer chofer;
	private Double cantDeKm;

	public Vehiculo(String patente, Chofer chofer, Double cantDeKm) {
		super();
		this.patente = patente;
		this.cantDeKm = cantDeKm;
		this.chofer = chofer;
	}

	public void asignarChofer(Chofer nuevo) {
		this.chofer = nuevo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}

	public Double getCantDeKm() {
		return cantDeKm;
	}

	public void setCantDeKm(Double cantDeKm) {
		this.cantDeKm = cantDeKm;
	}

}
