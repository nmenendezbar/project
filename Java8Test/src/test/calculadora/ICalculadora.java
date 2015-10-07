package test.calculadora;

public interface ICalculadora {
	public void sumar(int x, int y);
	public int restar(int x, int y);
	
	public default int multiplicar(int x, int y) {
		return x*y;
	}
}
