import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimosCapicuasTest {

	@Test
	void test8() {
		int numero=8;
		boolean esperado= false;
		boolean resultado= PrimosCapicuas.esPrimoCapicua(numero);
		assertEquals(esperado,resultado);	
	}
	@Test
	void test131() {
		int numero=131;
		boolean esperado= true;
		boolean resultado= PrimosCapicuas.esPrimoCapicua(numero);
		assertEquals(esperado,resultado);	
	}
	@Test
	void test171() {
		int numero=171;
		boolean esperado= false;
		boolean resultado= PrimosCapicuas.esPrimoCapicua(numero);
		assertEquals(esperado,resultado);	
	}
	@Test
	void test151() {
		int numero=151;
		boolean esperado= true;
		boolean resultado= PrimosCapicuas.esPrimoCapicua(numero);
		assertEquals(esperado,resultado);	
	}
	@Test
	void test999() {
		int numero=999;
		boolean esperado= false;
		boolean resultado= PrimosCapicuas.esPrimoCapicua(numero);
		assertEquals(esperado,resultado);		
	}
	
	@Test
	void test30703() {
		int numero=30703;
		boolean esperado= true;
		boolean resultado= PrimosCapicuas.esPrimoCapicua(numero);
		assertEquals(esperado,resultado);	
	}
	@Test
	void test1001() {
		int numero=1001;
		boolean esperado= false;
		boolean resultado= PrimosCapicuas.esPrimoCapicua(numero);
		assertEquals(esperado,resultado);	
	}
}
