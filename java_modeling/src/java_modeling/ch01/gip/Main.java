package java_modeling.ch01.gip;

public class Main {

	public static void main(String[] args) {
		
		//합성 관계
		//컴퓨터만 생성해도 컴퓨터 부품들이 다 생성된다.
		// => 컴퓨터가 사라지면 컴퓨터 부품들도 다 사라진다.
		Computer1 c1 = new Computer1();
		
		
		//집약 관계
		MainBoard mb = new MainBoard();
		CPU cpu = new CPU();
		Memory m = new Memory();
		PowerSupply ps = new PowerSupply();
		
		Computer2 c2 = new Computer2(mb,cpu, m, ps);
	}

}
