package test.ch08;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);

		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("============================");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);
//		
//		rc.setVolume(5);
//		rc.turnOn();
		
		RemoteControl.changeBattery();
		
	
	}

}
