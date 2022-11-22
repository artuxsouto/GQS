import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteClasseConta {

	
	@Test
	void testConta00() {
		Agencia agencia = new Agencia();
		agencia.setNumero("0265");
		Conta conta = new Conta(agencia, true, 5500.00);
		
		assertNotNull(conta);
	}
	

}
