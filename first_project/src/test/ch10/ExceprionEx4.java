package test.ch10;

public class ExceprionEx4 {

	public static void main(String[] args) {
		String [] array = {"100", "1oo",null, "200"};
		
		for(int i=0 ; i<=array.length ; i++) {
			try {
				int value = Integer.parseInt(array[i]);	//int로 형변환
				System.out.println("array[" + i + "]: " + value );
				
			}catch(ArrayIndexOutOfBoundsException e){
				e.printStackTrace();
				
			}catch(NullPointerException | NumberFormatException e) {		//두가지 이쌍의 예외를 동일하게 처리
//				System.out.println("데이터에 문제가 있음.);	
			}
		}
	}

}
