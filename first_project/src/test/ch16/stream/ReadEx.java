package test.ch16.stream;

import java.io.FileInputStream;

public class ReadEx {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while (true) {
				int data = is.read();	//1바이트씩 읽는다.
				
				if(data == -1) break;
				
				System.out.println(data);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
