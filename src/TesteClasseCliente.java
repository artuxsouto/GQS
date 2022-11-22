import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteClasseCliente {
	
	@Test
	void testCliente00() {
		Cliente instance = new Cliente();
		Cliente cliente = instance;
		
		assertSame(instance, cliente);
	}
	
	@Test
	void testCPF00() {
		Cliente instance = new Cliente();
		
		String cpf = "12345678910";
		instance.setCpf(cpf);
		System.out.println(instance.isCpfValido(instance.getCpf()));	
		System.out.println(instance.getCpf().length());		
		assertTrue(instance.isCpfValido(instance.getCpf()));
	}
}
