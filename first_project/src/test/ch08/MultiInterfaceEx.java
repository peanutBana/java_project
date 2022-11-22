package test.ch08;

public class MultiInterfaceEx {
	public static void main(String[] args) {
		RemoteControl2 rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("넷플릭스");
	}
}
