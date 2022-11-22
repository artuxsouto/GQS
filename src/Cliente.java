
public class Cliente implements Cadastro {
	
	private long id;
	private String cpf;
	private String nome;

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(long id) {
		// TODO Auto-generated method stub

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean isCpfValido(String cpf) {
		//Remove caracteres não numéricos do CPF.
		cpf = cpf.replaceAll("//D", "");
		
		if (cpf.length() != 11) {
			return false;
		}
		String d1 = "";
		String d2 = "";
		
		String digVerificadorCalculado = d1 + d2;
		String digVerificadorExistente = cpf.substring(cpf.length() - 2);
		
		return digVerificadorExistente.equals(digVerificadorCalculado);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}