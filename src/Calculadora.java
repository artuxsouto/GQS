
public class Calculadora {
	
	public double somar(double a, double b) {
		return a + b;
	}
	public double subtrarir(double a, double b) {
		return a - b;
	}
	public double dividir(double a, double b) {
		if(b != 0) {
			return a / b;
		}else {
			return -1;	
		}
	}
	public double multiplicar(double a, double b) {
		return a * b;
	}
}
