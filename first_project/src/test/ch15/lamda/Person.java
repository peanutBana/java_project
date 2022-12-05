package test.ch15.lamda;

public class Person {

//	@Override
//	public double calc(double x, double y) {
//		x = 10;
//		y = 4;
//		return x+y;
//	}
	public void action(Calculable2 calculable2) {
		double result = calculable2.calc(10, 4);
		System.out.println("결과: " + result);
	}
}
