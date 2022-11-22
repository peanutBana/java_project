package test.ch08.type2;

public class Bus implements Vehicle	{

	@Override
	public void run() {
		System.out.println("부릉부릉");
	}
	
	public void checkFare() {
		System.out.println("승차요금 체크");		
	}

}
