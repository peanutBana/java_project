package test.ch11.wrapper;

public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2);	//false ==> Integer가 객체타입이기 때문에 (String과 같은 경우)
		System.out.println(obj1.equals(obj2));
		System.out.println();
		
		/*
		 * [값을 비교하는 타입]
		 Boolean
		 Character
		 byte, short, Integer : -128 ~ 127  
		 */
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);	
		System.out.println(obj1.equals(obj2));
		
			
	}

}
