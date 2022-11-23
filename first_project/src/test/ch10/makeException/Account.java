package test.ch10.makeException;

public class Account {
//	필드
	private long balance;	//잔고
	
//	생성자
	public Account() {
		
	}
	
//	메소드
	public long getBalance() {
		return balance;
	}
	
//	저축
	public void deposit(int money) {
		balance += money;	//잔고에 돈을 누적 합산
	}
	
//	출금
	public void withDraw(int money) throws InsuffException {		//잔고보다 내가 출금하려는 돈이 더 크면 예외 발생
		if(money > balance) {
			throw new InsuffException("잔고 부족 : " + (money - balance) + "원이 모자람.");
		}
		balance -= money;
	}
}
