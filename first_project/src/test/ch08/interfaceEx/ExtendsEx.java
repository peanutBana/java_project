package test.ch08.interfaceEx;

public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceCImple ipl = new InterfaceCImple();
		
		InterfaceA ia = ipl;
		ia.methodA();
		
		InterfaceB ib = ipl;
		ib.methodB();
		
		InterfaceC ic = ipl;
		ic.methodC();
		ic.methodB();
		ic.methodA();
	}

}
