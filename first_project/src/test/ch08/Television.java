package test.ch08;

public class Television implements RemoteControl{
	//필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV전원을 켭니다.");
	}

	@Override
	public void turnOff() {		
		System.out.println("TV전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		
	}
	
}
