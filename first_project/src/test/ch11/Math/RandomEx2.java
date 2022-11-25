package test.ch11.Math;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		for(int i=0; i<=5; i++) {
			System.out.print(rand.nextInt(10)+",");	// 0<= n < 10의 int 타입의 난수 n 리턴
		}
		
		System.out.println("");
		
		Random rand2 = new Random(100);	//seed를 넣어줌
		for(int i=0; i<=5; i++) {
			System.out.print(rand2.nextInt(100)+",");
		}
	}

}
