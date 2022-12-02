package test.ch13.sync;

public class User2Thread extends Thread{
	private Calculator calculator;
	
	public User2Thread() {
		setName("user2Thread");	//스레드 이름 set
	}

public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		
	}

	//스레드가 실행되면 실행됨
	@Override
	public void run() {
		calculator.setMemory2(50);
	}

}
