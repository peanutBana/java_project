package test.ch11.Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationEx {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			PrintAnnotation printAno = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAno);
			
//			getDeclaredMethods 사용시 method.invoke로 메소드를 하나씩 가져올 수 있다.
			method.invoke(new Service());
		}
	}
	public static void printLine(PrintAnnotation printAno) {
		if(printAno != null) {
			//number속성 값 얻기
			int number = printAno.number();
			String value = printAno.value();
			
			System.out.println(number);
			System.out.println(value);
		}
	}

}
