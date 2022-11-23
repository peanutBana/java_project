package test.ch10.makeException;

public class AccountEx {

	public static void main(String[] args) {
		//계좌 생성
		Account account = new Account();
		
		//저축
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());		//잔고 가져옴
		
		//출금
		try {
			account.withDraw(30000);
		} catch (InsuffException e) {
			String message = e.getMessage();	//에러 메세지 받기
			System.out.println(message);
		}
	}

}
