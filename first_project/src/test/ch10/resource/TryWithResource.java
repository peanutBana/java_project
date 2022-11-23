package test.ch10.resource;

public class TryWithResource {

	public static void main(String[] args) {
//		try(MyResource res = new MyResource("A")){
//			String data = res.read1();
//			int value = Integer.parseInt(data);
//			
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//			
//		}
		try(MyResource res = new MyResource("A")){
			String data = res.read2();		//NumberFormatException 발생
			int value = Integer.parseInt(data);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
