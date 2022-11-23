package test.ch10;

public class ExceprionEx3 {

	public static void main(String[] args) {
		String [] array = {"100", "1oo"};
		
		for(int i=0 ; i<=array.length ; i++) {
			try {
				int value = Integer.parseInt(array[i]);	//int로 형변환
				System.out.println("array[" + i + "]: " + value );
			}catch(ArrayIndexOutOfBoundsException e){
				e.printStackTrace();
			}catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}

}
