package test.ch12.interfaceGeneric;

public class HomeAgency implements Rentable<Home>{

	@Override
	public Home rent() {
		return new Home();
	}

}
