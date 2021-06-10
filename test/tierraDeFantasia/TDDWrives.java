package tierraDeFantasia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TDDWrives {

	@Test
	void test001() { //Salud
		Wrives guerreroWrives = new Wrives();
		Assertions.assertEquals(108, guerreroWrives.getSalud());
	}
	@Test
	void test002() { //Chequea si recibio ataque
		Wrives guerreroWrives = new Wrives();
		Assertions.assertFalse( guerreroWrives.recibioAtaque());
	}
	
	@Test
	void test003() { //Ataque devuelve falso porque Wrives aun no fue atacado
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Nortaichian();
		Assertions.assertFalse(guerreroWrives.atacar(adversario));
	}
	
	@Test
	void test004() { //RecibeAtaque
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Nortaichian();
		boolean ataqueExitoso =adversario.atacar(guerreroWrives);
		Assertions.assertTrue(guerreroWrives.recibioAtaque());
	}
	
	@Test
	void test005() { //RecibeAtaque y chequea salud
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Nortaichian();
		boolean ataqueExitoso =adversario.atacar(guerreroWrives);
		Assertions.assertEquals(108-36, guerreroWrives.getSalud());
	}
	@Test
	void test006() { //RecibeAtaque pero no se desmaya
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Nortaichian();
		boolean ataqueExitoso =adversario.atacar(guerreroWrives);
		Assertions.assertFalse( guerreroWrives.estaDesmayado());
	}
	
	@Test
	void test007() { //Wrives ataca
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Nortaichian();
		boolean ataqueExitoso =adversario.atacar(guerreroWrives);
		Assertions.assertTrue( guerreroWrives.atacar(adversario));
		
	}
	
	@Test
	void test008() { //Ataque con desmayo enemigo
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Nortaichian();
		boolean ataqueExitoso =adversario.atacar(guerreroWrives);
		ataqueExitoso =guerreroWrives.atacar(adversario);
		Assertions.assertTrue( adversario.estaDesmayado());
		
	}
	@Test
	void test009() { //Ataque doble!!
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Enemigo();
		boolean ataqueExitoso =adversario.atacar(guerreroWrives);
		ataqueExitoso =guerreroWrives.atacar(adversario);
		ataqueExitoso =adversario.atacar(guerreroWrives);
		ataqueExitoso =guerreroWrives.atacar(adversario);
		Assertions.assertEquals(300-113-226, adversario.getSalud());
		
	}
	
	@Test
	void test010() { //Recibe ataque y luego descansa, recobra 50 de salud
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Enemigo();
		boolean ataqueExitoso =adversario.atacar(guerreroWrives);
		ataqueExitoso =guerreroWrives.atacar(adversario);
		guerreroWrives.descansar();
		Assertions.assertEquals(108-40*2+50, guerreroWrives.getSalud());
		
	}
	
	@Test
	void test011() { //Es atacado y se desmaya
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Enemigo();
		boolean ataqueExitoso =adversario.atacar(guerreroWrives);
		ataqueExitoso =adversario.atacar(guerreroWrives);
		ataqueExitoso =adversario.atacar(guerreroWrives);
		Assertions.assertTrue( guerreroWrives.estaDesmayado());
	
	}
	@Test
	void test012() { //Salud menor a 0
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Enemigo();
		boolean ataqueExitoso =adversario.atacar(guerreroWrives);
		ataqueExitoso =adversario.atacar(guerreroWrives);
		ataqueExitoso =adversario.atacar(guerreroWrives);
		Assertions.assertEquals( -132,guerreroWrives.getSalud());
		
	}
	@Test
	void test013() { //Salud menor a 0
		Wrives guerreroWrives = new Wrives();
		Guerrero adversario = new Enemigo();
		adversario.atacar(guerreroWrives);
		Assertions.assertTrue( adversario.atacar(guerreroWrives));
		
	}
	

}
