package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateoOpEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();	//현재 날짜 시간
		
		//데이터 포맷
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		now.format(dtf);
		System.out.println(dtf);
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println(result1.format(dtf));
		
		LocalDateTime result2 = now.minusMonths(1);
		System.out.println(result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println(result3.format(dtf));
	}

}
