package test.ch15.lamda;

public class LambaEx {
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.calc(x,y);
	}
	
	public static void main(String[] args) {
//		action(new Calculable(){
//			@Override
//			public void calc(int x, int y) {
//				System.out.println(x-y);
//			}
//		});
		
		action((x,y)->{
			System.out.println(x+y);
		}) ;
		
		action((x,y)->System.out.println(x-y)) ;
		
//		매개변수 하나일 경우 () 생략 가능
//		action(x -> System.out.println(x);)
	}
}
