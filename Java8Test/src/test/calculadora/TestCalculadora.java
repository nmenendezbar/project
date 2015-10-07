package test.calculadora;

public class TestCalculadora {
	public static void main(String... args) {
		Calculadora c = new Calculadora();
		c.sumar(2, 3);
		System.out.println("La multiplicacion es "+ c.multiplicar(2, 3));
	}
}
