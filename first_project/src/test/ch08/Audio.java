package test.ch08;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public void setVolume(int volume) {
	}

}

