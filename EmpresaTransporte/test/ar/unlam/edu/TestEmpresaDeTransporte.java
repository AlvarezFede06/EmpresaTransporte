package ar.unlam.edu;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpresaDeTransporte {

	@Test
	public void queSePuedaAgregarUnaMotoALaEmpresa() {
		Empresa empresa = new Empresa("Alvarez Srl", "Jorge de Kay 1546");
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Motocicleta moto = new Motocicleta("MHY337", chofer, null, 45.2);

		assertTrue(empresa.agregarVehiculo(moto));
		assertEquals(1, empresa.getVehiculos().size());
		assertEquals(moto, empresa.getVehiculos().get(0));
	}

	@Test
	public void queSePuedaAsignarUnChoferAUnaMoto() {
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Motocicleta moto = new Motocicleta("MHY337", chofer, null, 45.2);

		moto.asignarChofer(chofer);

		assertEquals(chofer, moto.getChofer());
	}

	@Test
	public void queSePuedaCambiarDeChoferAUnaMoto() {
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Chofer chofer1 = new Chofer("Alvarez Juan", 46874682, 18);
		Motocicleta moto = new Motocicleta("MHY337", chofer, null, 45.2);

		moto.cambiarChofer(chofer1);
		;

		assertEquals(chofer1, moto.getChofer());
	}

	@Test
	public void queSePuedaAgregarUnAcompananteAUnaMotocicleta() {
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Motocicleta moto = new Motocicleta("MHY337", chofer, null, 45.2);

		moto.agregarAcompanante("Pedro");

		assertEquals("Pedro", moto.getAcompañante());
	}

	@Test
	public void queSePuedaAgregarUnAutobusALaEmpresa() {
		Empresa empresa = new Empresa("Alvarez Srl", "Jorge de Kay 1546");
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Autobus bus = new Autobus("KIO789", chofer, 30.5);

		assertTrue(empresa.agregarVehiculo(bus));
		assertEquals(1, empresa.getVehiculos().size());
		assertEquals(bus, empresa.getVehiculos().get(0));
	}

	@Test
	public void queSePuedaAsignarUnChoferAUnAutobus() {
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Autobus bus = new Autobus("KIO789", null, 30.5);

		bus.asignarChofer(chofer);

		assertEquals(chofer, bus.getChofer());
	}

	@Test
	public void queSePuedaCambiarDeChoferAUnAutobus() {
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Chofer chofer1 = new Chofer("Alvarez Juan", 46874682, 18);
		Autobus bus = new Autobus("KIO789", chofer, 30.5);

		bus.cambiarChofer(chofer1);
		;

		assertEquals(chofer1, bus.getChofer());
	}

	@Test
	public void queSePuedaAgregarPasajerosAUnAutobus() {
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Pasajero pasajero1 = new Pasajero("Carlos", 45414514, 25);
		Pasajero pasajero2 = new Pasajero("Marcos", 41584554, 48);
		Pasajero pasajero3 = new Pasajero("Julian", 48798479, 69);
		Pasajero pasajero4 = new Pasajero("Juan", 18414656, 47);
		Autobus bus = new Autobus("KIO789", chofer, 30.5);

		bus.agregarPasajero(pasajero1);
		bus.agregarPasajero(pasajero2);
		bus.agregarPasajero(pasajero3);
		bus.agregarPasajero(pasajero4);

		assertEquals(4, bus.getPasajeros().size());
		assertEquals(pasajero1, bus.getPasajeros().get(0));
	}

	@Test
	public void queNoSePuedaCambiarDeChoferAUnAutobusSiHayPasajeros() {
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Pasajero pasajero1 = new Pasajero("Carlos", 45414514, 25);
		Autobus bus = new Autobus("KIO789", chofer, 30.5);

		bus.agregarPasajero(pasajero1);

		Chofer chofer1 = new Chofer("Alvarez Juan", 46874682, 18);
		bus.cambiarChofer(chofer1);

		assertEquals(chofer, bus.getChofer());
	}

	@Test
	public void queNoSePuedaCambiarDeChoferAUnaMotoSiHayPasajeros() {
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Motocicleta moto = new Motocicleta("MHY337", chofer, null, 45.2);

		moto.agregarAcompanante("Pedro");

		Chofer chofer1 = new Chofer("Alvarez Juan", 46874682, 18);
		moto.cambiarChofer(chofer1);

		assertEquals(chofer, moto.getChofer());
	}

	@Test
	public void queNoSePuedanAgregarMasPasajerosSiLosAsientosEstanOcupados() {
		Chofer chofer = new Chofer("Juan", 123456, 35);
		Autobus autobus = new Autobus("ABC123", chofer, 100.0);

		for (int i = 0; i < 20; i++) {
			Pasajero pasajero = new Pasajero("Carlos", 45414514, 25 + i);
			assertTrue(autobus.agregarPasajero(pasajero));
		}

		Pasajero pasajeroExtra = new Pasajero("Carlos", 45414514, 25);
		assertFalse(autobus.agregarPasajero(pasajeroExtra));

		assertEquals(20, autobus.getPasajeros().size());
	}

	@Test
	public void queSePuedaAgregarUnAutomovilALaEmpresa() {
		Empresa empresa = new Empresa("Alvarez Srl", "Jorge de Kay 1546");
		Chofer chofer = new Chofer("Alvarez Hector", 13751975, 64);
		Automovil auto = new Automovil("KIO789", chofer, 30.5);

		assertTrue(empresa.agregarVehiculo(auto));
		assertEquals(1, empresa.getVehiculos().size());
		assertEquals(auto, empresa.getVehiculos().get(0));
	}

	@Test
	public void queNoSePuedanAgregarMasDeTresPasajerosAlAutomovil() {
		Chofer chofer = new Chofer("Juan", 123456, 35);
		Automovil auto = new Automovil("ABC123", chofer, 100.0);

		for (int i = 0; i < 3; i++) {
			Pasajero pasajero = new Pasajero("Carlos", 45414514, 25);
			assertTrue(auto.agregarPasajero(pasajero));
		}

		Pasajero pasajeroExtra = new Pasajero("Marcos", 474848484, 30);
		assertFalse(auto.agregarPasajero(pasajeroExtra));

		assertEquals(3, auto.getPasajeros().size());
	}

}
