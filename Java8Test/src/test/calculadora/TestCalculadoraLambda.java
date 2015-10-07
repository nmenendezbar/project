package test.calculadora;

public class TestCalculadoraLambda {
	
	public static int restar(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {
		ICalculadoraLambda iSuma = (x, y) -> x + y;
		System.out.println(iSuma.operation(4,  5));

		ICalculadoraLambda iMultiplication = (x, y) -> x * y;
		System.out.println(iMultiplication.operation(4,  5));
		
	}

}
