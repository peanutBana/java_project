package test.ch11.String;

public class StringBuilderEx {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")		//문자열 끝에 삽입.
				.insert(0,"ABC")	//문자열 위치를 지정하여 삽입.		
				.delete(2,4)		//문자열 일부를 삭제(시작인덱스, 끝 위치)
				.toString();		//완성된 문자열을 String으로 반환
		System.out.println(data);
	}

}
