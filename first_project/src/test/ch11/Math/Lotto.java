package test.ch11.Math;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		//선택 번호(내가 선택한 번호 저장)
		int[] selectNumber = new int[6];
		Random rand = new Random();
		System.out.print("선택 번호: ");
		
		for(int i=0; i<=5; i++) {
			selectNumber[i] = rand.nextInt(45) + 1;		//1~45 난수
			System.out.print(selectNumber[i] + ",");
		}
		Arrays.sort(selectNumber);
		
		System.out.println("");
		
		//당첨번호(컴퓨터에서 주는 번호)
		int[] winNumber = new int[6];
		Random rand2 = new Random();
		System.out.print("선택 번호: ");
		
		for(int i=0; i<=5; i++) {
			winNumber[i] = rand2.nextInt(45) + 1;		//1~45 난수
			System.out.print(winNumber[i] + ",");
		}
		Arrays.sort(winNumber);
				
		System.out.println("");
		
		//당첨여부
		int cnt=0;
		while(true) {	
			if(Arrays.equals(selectNumber , winNumber)) {
				System.out.println("당첨");
				break;
			}else {
				System.out.println("낙첨");
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
