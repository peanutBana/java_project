package test.ch11.Math;

public class RandomEx {

	public static void main(String[] args) {
		//0.0 ~ 1.0 사이의 숫자 출력(소수, double타입으로 출력)
		System.out.println(Math.random());
		
		int n = 9;	//n 개의 정수
		int start = 1;	//시작하는 숫자
		int num = (int)(Math.random()* n ) + start;
		
		System.out.println(num);
	}

}
