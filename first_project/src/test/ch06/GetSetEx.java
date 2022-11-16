package test.ch06;

public class GetSetEx {

	public static void main(String[] args) {
		GetSet getset = new GetSet();
		
		getset.setSpeed(10);	//private 선언됨 X 
		System.out.println(getset.getSpeed());
//		getset.stop(); //private 선언됨 X
		
		if(!getset.isStop()) { 	//달리고 있을 때
			getset.setStop(true);
		}

		System.out.println(getset.getSpeed());
	}

}
