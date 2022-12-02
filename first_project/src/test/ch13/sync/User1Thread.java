package test.ch13.sync;

public class User1Thread extends Thread{
	private Calculator calculator;
	
	public User1Thread() {
		setName("user1Thread");	//스레드 이름 set
	}

public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		
	}

	//스레드가 실행되면 실행됨
	@Override
	public void run() {
		calculator.setMemory1(100);
	}

	
}
