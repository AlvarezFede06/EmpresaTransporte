package ar.unlam.edu;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private String direccion;
	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<Pasajero> pasajeros;
	private ArrayList<Chofer> chofer;

	public Empresa(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.vehiculos = new ArrayList<>();
		this.pasajeros = new ArrayList<>();
		this.chofer = new ArrayList<>();
	}

	public Boolean agregarVehiculo(Vehiculo nuevo) {
		return vehiculos.add(nuevo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public ArrayList<Chofer> getChofer() {
		return chofer;
	}

	public void setChofer(ArrayList<Chofer> chofer) {
		this.chofer = chofer;
	}

}
