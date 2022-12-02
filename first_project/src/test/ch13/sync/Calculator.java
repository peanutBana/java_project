package test.ch13.sync;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	//메소드에 동기화 걸기
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	public void setMemory2(int memory) {
		
		//코드 블록에 동기화 걸기(원하는 코드 범위 선택)
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
			
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
	}
	
}
