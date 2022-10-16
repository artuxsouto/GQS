import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteClasseMovimentacao {

	@Test
	void testGetId() {
		Movimentacao instance = new Movimentacao(new Conta());
		long esperado = 1;
		instance.setId(esperado);
		long obtido = instance.getId();
		assertEquals(esperado, obtido);
	}
	
	@Test
	void setDescricaoNula() {
		Movimentacao instance = new Movimentacao(new Conta());
		assertThrows(NullPointerException.class, () -> instance.setDescricao(null));
	}
	
	@Test
	void setDescricaoVazia() {
		Movimentacao instance = new Movimentacao(new Conta());
		assertThrows(IllegalArgumentException.class, () -> instance.setDescricao(""));
	}
	
	@Test
	void setDescricaoBranco() {
		Movimentacao instance = new Movimentacao(new Conta());
		String espacosEmBranco = "           ";
		assertThrows(IllegalArgumentException.class, () ->instance.setDescricao(espacosEmBranco));
	}
}