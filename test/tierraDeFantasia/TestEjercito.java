package tierraDeFantasia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestEjercito {

	@Test
	void test() {
		Ejercito ejercitoWrive = new Ejercito();
		Wrives guerrero = new Wrives();
		ejercitoWrive.agregar(guerrero);
		Assertions.assertEquals(108	, ejercitoWrive.listarSiguiente().getSalud());
	}
	@Test
	void testListarSuiguiente() {
		Ejercito ejercitoWrive = new Ejercito();
		Wrives guerrero = new Wrives();
		ejercitoWrive.agregar(guerrero);
		Assertions.assertEquals(108	, ejercitoWrive.obtenerSiguiente().getSalud());
	}
	
	@Test
	void testAgregarYListarEjercitoEvaluarPosicion0() {
		Ejercito ejercito = new Ejercito();
		Ejercito ejercitoNortaichian = new Ejercito();
		Wrives guerrero = new Wrives();
		ejercito.agregar(guerrero);
		ejercito.agregar(ejercitoNortaichian);
		Nortaichian aliado = new Nortaichian();
		ejercitoNortaichian.agregar(aliado);
		Assertions.assertEquals(108, ejercito.toArray()[0].getSalud());
		
	}
	@Test
	void testAgregarYListarEjercitoEvaluarPosicion1() {
		Ejercito ejercito = new Ejercito();
		Ejercito ejercitoNortaichian = new Ejercito();
		Wrives guerrero = new Wrives();
		ejercito.agregar(guerrero);
		ejercito.agregar(ejercitoNortaichian);
		Nortaichian aliado = new Nortaichian();
		ejercitoNortaichian.agregar(aliado);
		Assertions.assertEquals(66, ejercito.toArray()[1].getSalud());
		
	}

}
