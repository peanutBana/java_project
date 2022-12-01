package singletone;

public class Printer {
	//2. 필드
	private static Printer printer = null;
	
	//1.private으로 선언 => 외부에서 생성x
	private Printer() { 	
		
	}
	
	//메소드
	public static Printer getPrinter() {
		//3. printer가 null일때 한번만 생성 가능
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}	
}
