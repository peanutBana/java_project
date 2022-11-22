package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
		Vehicle veh = new Bus();		
	}
	
	public static void ride(Vehicle veh) {
		if(veh instanceof Bus) {
			Bus bus = (Bus)veh;
			bus.run();
			bus.checkFare();
		}
	}
	

}
