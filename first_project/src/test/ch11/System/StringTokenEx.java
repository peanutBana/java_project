package test.ch11.System;

public class StringTokenEx {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		
		String[] arr = data1.split("&|,");
		for(String token: arr) {
			System.out.println(token);
		}
		
		String data2 = "홍길동/이수홍,박연수";
		
	}

}
