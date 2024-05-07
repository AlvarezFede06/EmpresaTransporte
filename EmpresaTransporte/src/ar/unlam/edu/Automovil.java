package ar.unlam.edu;

import java.util.ArrayList;

public class Automovil extends Vehiculo {

	private ArrayList<Pasajero> pasajeros;
	private Integer asientosOcupados;

	public Automovil(String patente, Chofer chofer, Double cantDeKm) {
		super(patente, chofer, cantDeKm);
		this.pasajeros = new ArrayList<>();
		this.asientosOcupados = 0;
	}

	public Boolean agregarPasajero(Pasajero pasajero) {
		if (asientosOcupados < 3) {
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

}
