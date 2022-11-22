import java.util.List;

public class Conta implements Cadastro {
	
	private long id;
	private String numero;
	private boolean poupanca;
	private boolean especial;
	private double saldo;
	private double limite;
	private List<Movimentacao> movimentacoes;
	
	public Conta() {
		// Todo: Você precisa implementar este método.
	}
	
	public Conta(Agencia agencia, boolean especial, final double limite) {
		// Todo: Você precisa implementar este método.
	}
	
	public List<Movimentacao> getMovimentacoes(){
		return movimentacoes;
	}
	
	public void addMovimentacao(Movimentacao movimentacao) {
		// Todo: Você precisa implementar este método.
	}
	
	public double getSaldoTotal() {
		/* Todo: Você precisa implementar este método.
		A linha abaixo deve ser substituida pelo seu codigo*/
		return saldo;
	}
	
	public void saque (final double valor) {
		// Todo: Você precisa implementar este método.
	}
	
	public void depositoDinheiro(final double valor) {
		// Todo: Você precisa implementar este método.
	}
	
	public void depositoCheque(final double valor) {
		// Todo: Você precisa implementar este método.
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isPoupanca() {
		return poupanca;
	}

	public void setPoupanca(boolean poupanca) {
		this.poupanca = poupanca;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}
}