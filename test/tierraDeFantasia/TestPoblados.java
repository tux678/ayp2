package tierraDeFantasia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPoblados {

	@Test
	void testCantidadDePoblados() {
		Mapa mapa = new Mapa();
		Assertions.assertEquals(4, mapa.getCantidadDePoblados());
		
	}
	@Test
	void testLeerPuebloPropio() {
		Mapa mapa = new Mapa();
		Assertions.assertEquals(1, mapa.getPuebloPropio().getId());
	}
	
	@Test
	void testGetPuebloInicio() {
		Mapa mapa = new Mapa();
		Assertions.assertEquals(1, mapa.getPuebloDeInicio());
		
	}
	
	@Test
	void testGetPuebloFinal() {
		Mapa mapa = new Mapa();
		Assertions.assertEquals(4, mapa.getPuebloFinal());
	}
	
	@Test
	void testGetTotalDeHabitantesPuebloPropio() {
		Mapa mapa = new Mapa();
		Assertions.assertEquals(100, mapa.getPuebloPropio().getCantidadDeHabitantes());
		
	}
	
	@Test
	void testGetNombreDelPuebloPropio() {
		Mapa mapa = new Mapa();
		Assertions.assertEquals("Wrives", mapa.getPuebloPropio().getNombre());
	}
	
	@Test
	void testGetCostoDeTrasladoAlPueblo2() {
		Mapa mapa = new Mapa();
		Assertions.assertEquals(10, mapa.getCosto(2));
	}

}


