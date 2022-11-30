package test.ch12.method;

public class GenericEx {
	//Generic method
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		//Generic method call: T를 Integer로 대체
		 Box<Integer> box1 = boxing(100);
		int intVal = box1.get();
		System.out.println(intVal);
		
		Box<String> box2 = boxing("박민우");
		String strVal = box2.get();
		System.out.println(strVal);
	}

}
