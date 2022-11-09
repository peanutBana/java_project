package test.ch03;

public class Operator {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z ;
		
		x++;
		++x;
		System.out.println("x = " + x);
		System.out.println("---------");

		y--;
		--y;
		System.out.println("y = " + y);
		System.out.println("---------");
		
		//후위연산자는 선 대입 후 증가
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("---------");
		
		//전위연산자는 선 증가 후 대입
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);

		System.out.println("---------");
		
		z = ++x + ++y;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
