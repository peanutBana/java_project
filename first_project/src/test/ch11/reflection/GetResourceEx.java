package test.ch11.reflection;

public class GetResourceEx {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("Doraemon.png").getPath();	//해당 파일의 경로 저장
		String photo2Path = clazz.getResource("images/Doraemon.png").getPath();
		System.out.println(photo1Path);
		System.out.println(photo2Path);
		
		
	}

}
