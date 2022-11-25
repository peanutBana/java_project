package test.ch11.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);	//현재 날짜와 시간(Date객체로)
		
		String strNow = date.toString();
		System.out.println(strNow);	//문자열로 출력
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(date);		//sdf.format(날짜객체)
		System.out.println(strNow2);
		
	}

}
