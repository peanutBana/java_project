package test.ch11.Date;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month= cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"/"+month+"/"+date);
		
		String strDay = null;
		
		switch(day) {
		case 1: strDay="토요일";
		case 2: strDay="일요일";
		case 3: strDay="월요일";
		case 4: strDay="화요일";
		case 5: strDay="수요일";
		case 6: strDay="목요일";
		case 7: strDay="금요일";
		}
		System.out.println(strDay);
		
		int amPm = cal.get(Calendar.AM_PM);
//		System.out.println(amPm);		//오전: 0 / 오후: 1
		
		if(amPm == Calendar.AM) {
			System.out.println("오전입니다.");
		}
		else {
			System.err.println("오후입니다.");
		}
		System.out.println(cal.get(Calendar.HOUR)+","+cal.get(Calendar.MINUTE)+","+cal.get(Calendar.SECOND));
		System.out.println(timeZone);
	}

}
