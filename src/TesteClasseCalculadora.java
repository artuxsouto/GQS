import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteClasseCalculadora {

	@Test
	void testSomar() {
		Calculadora c = new Calculadora();
		double res = c.somar(10, 50);
		assertEquals(60, res);
	}
	
	@Test
	void testSubtrair() {
		Calculadora c = new Calculadora();
		double res = c.subtrarir(10, -15);
		assertEquals(25,res);
	}
	
	@Test
	void testDividir() {
		Calculadora c = new Calculadora();
		double res = c.dividir(10.0, 0);
		assertNotEquals(Double.isFinite(res), false);
	}
	
	@Test
	void testMultiplicar() {
		Calculadora c = new Calculadora();
		double res = c.multiplicar(12, 6);
		assertEquals(72, res);
	}
}
