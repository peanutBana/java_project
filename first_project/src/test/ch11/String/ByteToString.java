package test.ch11.String;

import java.util.Arrays;

public class ByteToString {

	public static void main(String[] args) {
		String data = "자바";
		
		byte[] arr1 = data.getBytes();		//utf-8로 인코딩
		System.out.println(Arrays.toString(arr1));	//배열을 문자열로 바꾼다.
		
		String str1 = new String(arr1);
		System.out.println(str1);
		
	}

}
