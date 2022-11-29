package test.ch12;

public class GenericEx {

	public static void main(String[] args) {
//		Box<String> box1 = new Box<>();		
		Box<String> box1 = new Box<String>();
		
		box1.content = "String";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int val = box2.content;
		System.out.println(val);
	}
}
