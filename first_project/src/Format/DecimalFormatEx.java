package Format;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double num = 12345678.89;
		
		DecimalFormat df = new DecimalFormat("#,###.0");	// 포맷 설정
		System.out.println(df.format(num));	//포맷 적용
		
	}

}
