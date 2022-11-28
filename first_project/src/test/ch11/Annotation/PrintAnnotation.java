package test.ch11.Annotation;

import java.lang.annotation.*;

//어노테이션 정의


//Target: 어노테이션을 사용 할 수 있는 곳을 지정
//@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})	//메소드에만 적용
//@Retention: 유지정책, 어노테이션의 유지구간을 설정

@Target({ElementType.METHOD})	//메소드에만 적용
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15	;
}
