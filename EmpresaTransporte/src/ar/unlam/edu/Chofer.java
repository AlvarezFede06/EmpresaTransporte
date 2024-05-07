package ar.unlam.edu;

public class Chofer {

	private String nombreyapelido;
	private Integer dni;
	private Integer edad;
	
	public Chofer(String nombreyapelido, Integer dni, Integer edad) {
		super();
		this.nombreyapelido = nombreyapelido;
		this.dni = dni;
		this.edad = edad;
	}

	public String getNombreyapelido() {
		return nombreyapelido;
	}

	public void setNombreyapelido(String nombreyapelido) {
		this.nombreyapelido = nombreyapelido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
}
