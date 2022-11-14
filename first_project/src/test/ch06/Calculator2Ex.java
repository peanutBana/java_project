package test.ch06;

public class Calculator2Ex {

	public static void main(String[] args) {
		//Calculator2 calc2 = new Calculator2();	//객체(인스턴스) 생성 
		//인스턴스를 통해서만 생성 가능
		//calc2.pi = 10;;
		Calculator2.plus(10,20);	//인스턴스를 생성하지 않아도 메소드에 접근이 가능함
		Calculator2.minus(100,50);
	}

}
