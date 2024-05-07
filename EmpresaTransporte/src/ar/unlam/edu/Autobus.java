package ar.unlam.edu;

import java.util.ArrayList;

public class Autobus extends Vehiculo {

	private ArrayList<Pasajero> pasajeros;
	private Integer asientosOcupados;

	public Autobus(String patente, Chofer chofer, Double cantDeKm) {
		super(patente, chofer, cantDeKm);
		this.pasajeros = new ArrayList<>();
		this.asientosOcupados = 0;
	}

	public Boolean agregarPasajero(Pasajero pasajero) {
		if (asientosOcupados < 20) {
			pasajeros.add(pasajero);
			asientosOcupados++;
			return true;
		}
		return false;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public void cambiarChofer(Chofer nuevoChofer) {
		if (pasajeros.isEmpty()) {
			this.asignarChofer(nuevoChofer);
		}
	}
}
