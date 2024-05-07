package ar.unlam.edu;

public class Motocicleta extends Vehiculo {

	private String Acompañante;

	public Motocicleta(String patente, Chofer chofer, String Acompañante, Double cantDeKm) {
		super(patente, chofer, cantDeKm);
		this.Acompañante = Acompañante;
	}

	public void cambiarChofer(Chofer nuevoChofer) {
		if (Acompañante == null) {
			this.asignarChofer(nuevoChofer);
		}
	}

	public void agregarAcompanante(String Acompañante) {
		this.Acompañante = Acompañante;
	}

	public String getAcompañante() {
		return Acompañante;
	}

	public void setAcompañante(String Acompañante) {
		this.Acompañante = Acompañante;
	}

}
