package test.ch11.Annotation;

public class Service {
	//필드
	String test;
	
	//생성자
	Service(){}
	
	//메소드
	@PrintAnnotation	//default
	public void method1() {}
	
	@PrintAnnotation
	public void method2() {}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {}
	
}
