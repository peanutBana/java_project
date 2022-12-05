package test.ch16.stream;

import java.io.FileInputStream;

public class ReadEx2 {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while (true) {
				int num = is.read();	//1바이트씩 읽는다.
				
				if(num == -1) break;
				
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);					
				}
			}
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
