package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateoOpEx2 {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		//데이터 포맷
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 1);		//특정 날짜 지정 2021-01-01T00:00
		System.out.println("시작일: " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 1, 1, 0, 0 );		//특정 날짜 지정 2021-01-01T00:00
		System.out.println("종료일: " + startDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime)) {		//이전 날짜인지
			System.out.println("진행 중입니다.");
		}
		else if(startDateTime.isEqual(endDateTime)){	//같은 날짜인지
			System.out.println("종료합니다.");
		}
		else if(startDateTime.isAfter(endDateTime)) {	//이후 날짜인지
			System.out.println("종료했습니다.");
		}
		
	}

}
