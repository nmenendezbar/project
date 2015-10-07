package test.calculadora;

public class Calculadora implements ICalculadora {

	@Override
	public void sumar(int x, int y) {
		System.out.println("La suma de " + x + " + " + y + " es " + (x +y));

	}

	@Override
	public int restar(int x, int y) {
		return x-y;
	}

//	@Override
//	public int multiplicar(int x, int y) {
//		return (x+1)*(y+1);
//	}

}
